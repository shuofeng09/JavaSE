package day01.ArraryList集合;


/**
 * @author 朔风
 * @createTime 2022-09-26 17:01
 */
public class Xz_Dashen {
    protected String password;

    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse xiaomi = new Mouse("小米");
        Key sfy = new Key("双飞燕");
        computer.install(xiaomi);
        computer.install(sfy);
        long startTime = System.currentTimeMillis();

        for (int i = 1; i < 1000000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0 + "s");

    }

}

class Computer {
    //编译看左边，运行看右边
    public void install(USB usb) {
        usb.insert();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            System.out.println(mouse.getName());
            mouse.click();
        } else {
            Key key = (Key) usb;
            System.out.println(key.getName());
            key.click();
        }
        usb.push();
    }
}

class Mouse implements USB {

    private String name;

    // 双击
    public void click() {
        System.out.println(name + "被双击了");
    }

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void push() {
        System.out.println("使用鼠标");
    }

    @Override
    public void insert() {
        System.out.println("鼠标插入中");

    }
}

class Key implements USB {

    private String name;

    public Key(String name) {
        this.name = name;
    }

    // 打字
    public void click() {
        System.out.println(name + "在打字");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void push() {
        System.out.println("使用鼠标");
    }

    @Override
    public void insert() {
        System.out.println("键盘使用中");

    }
}

interface USB {
    public void push();


    public void insert();

}