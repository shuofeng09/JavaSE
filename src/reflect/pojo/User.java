package reflect.pojo;

import java.io.Serializable;

/**
 * @author 朔风
 * @date 2023-08-11 16:17
 */
public class User implements Serializable {

    private String name;
    private Integer age;

    private String sex;

    public User() {
    }

    public User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String method1(String s) {
        System.out.println(s);
        System.out.println("method1" + "共有的");
        return s;
    }

    private void method2() {
        System.out.println("method2" + "私有的");
    }

    protected void method3(int age) {
        System.out.println(age);
        System.out.println("method3=" + "受保护的");
    }

    void method4() {
        System.out.println("method4=" + "默认的");
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
