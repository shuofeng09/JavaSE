package 设计模式.Prototype.exmple.framework;

/**
 * @author 朔风
 * @createTime 2022-10-05 16:34
 */
public interface Product extends Cloneable {
    public void use(String s);

    //用于复制实例
    public Product createClone() throws CloneNotSupportedException;

}
