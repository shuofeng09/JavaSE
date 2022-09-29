package day01.ArraryList集合;

/**
 * @author 朔风
 * @createTime 2022-09-26 17:01
 */
public class Xz_Dashen {

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
        System.out.println("关机");

    }
}

class Key implements USB {

    private String name;

    public Key(String name) {
        this.name = name;
    }

    // 打字
    public void write() {
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
        System.out.println("关机");

    }
}

interface USB {
    public void push();


    public void insert();

}