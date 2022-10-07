package 设计模式.Factory.exmple;

import 设计模式.Factory.exmple.framework.Factory;
import 设计模式.Factory.exmple.framework.Product;
import 设计模式.Factory.exmple.idcard.IDCardFactory;

/**
 * @author 朔风
 * @createTime 2022-10-05 00:47
 */
public class Main {
    public static void main(String[] args) {
        //创建IDCard工厂
        Factory factory = new IDCardFactory();


        //制作IDCard产品
        Product c1 = factory.create("小明");
        Product c2 = factory.create("小王");
        Product c3 = factory.create("小黄");

        //使用
        c1.use();
        c2.use();
        c3.use();

    }
}
