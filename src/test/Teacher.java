package test;

/**
 * @author 朔风
 * @createTime 2022-07-06 13:01
 */
public class Teacher extends Person {
    @Override
    public void say() {
        System.out.println("批改作业");
        System.out.println("可以查看或者需要改");
    }

    @Override
    public void quanxian(Person person) {
        person.say();
    }
}
