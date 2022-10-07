package 设计模式.Prototype.exmple.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 朔风
 * @createTime 2022-10-05 16:36
 */
@SuppressWarnings("all")
public class Manager {
    //用于保存实例的 名字和实例 之间的对应关系
    private Map showCase = new HashMap<>();

    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    public Product create(String name) throws CloneNotSupportedException {
        Product p = (Product) showCase.get(name);
        return p.createClone();
    }
}
