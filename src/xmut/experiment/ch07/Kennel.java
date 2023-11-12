package xmut.experiment.ch07;

/**
 * @author 朔风
 * @date 2023-11-09 22:42
 */
public class Kennel {
    public static void main(String[] args) {
        Dog jack = new Dog("jack", 5);
        Dog bob = new Dog("bob", 1);
        Dog lily = new Dog("lily", 3);
        System.out.println(jack);
        System.out.println(bob);
        System.out.println(lily);
        System.out.println(jack.getAgeAsPerson());
    }
}
