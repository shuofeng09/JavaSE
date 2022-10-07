package 设计模式.Factory.A2;

import 设计模式.Factory.A2.framework.Factory;
import 设计模式.Factory.A2.framework.Product;
import 设计模式.Factory.A2.idcard.IDCardFactory;


/**
 * @author 朔风
 * @createTime 2022-10-05 01:22
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明", "a001");
        Product card2 = factory.create("小红", "a002");
        Product card3 = factory.create("小刚", "a003");
        card1.use();
        card2.use();
        card3.use();

        IDCardFactory idCardFactory = (IDCardFactory) factory;

        System.out.println(idCardFactory.getMaps());
    }
}
