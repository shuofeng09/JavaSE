package 设计模式.Prototype.exmple.subclass;

import 设计模式.Prototype.exmple.framework.Product;

/**
 * @author 朔风
 * @createTime 2022-10-05 20:16
 */
public class UnderlinePen implements Product {

    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() throws CloneNotSupportedException {
        Product p = null;
        p = (Product) clone();
        return p;
    }


}
