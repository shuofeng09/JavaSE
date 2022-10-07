package 设计模式.Prototype.exmple;

import 设计模式.Prototype.exmple.framework.Manager;
import 设计模式.Prototype.exmple.framework.Product;
import 设计模式.Prototype.exmple.subclass.MessageBox;
import 设计模式.Prototype.exmple.subclass.UnderlinePen;

/**
 * @author 朔风
 * @createTime 2022-10-05 20:20
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Manager manager = new Manager();
        UnderlinePen u = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('-');

        manager.register("strong message", u);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        Product p2 = manager.create("warning box");
        Product p3 = manager.create("slash box");

        p1.use("Hello world..");
        p2.use("Hello world..");
        p3.use("Hello world..");
    }
}
