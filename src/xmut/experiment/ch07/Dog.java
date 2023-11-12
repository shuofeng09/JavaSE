package xmut.experiment.ch07;

/**
 * @author 朔风
 * @date 2023-11-09 22:40
 */
public class Dog {
    private String name;
    private Integer age;

    public Integer getAgeAsPerson() {
        return this.age * 7;
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
