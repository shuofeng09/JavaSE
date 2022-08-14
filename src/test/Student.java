package test;

/**
 * @author 朔风
 * @createTime 2022-07-06 13:00
 */
public class Student extends Person {
    @Override
    public void say() {
        System.out.println("写作业");
        System.out.println("仅可以查看");
    }

    @Override
    public void quanxian(Person p) {
        p.say();
    }
}
