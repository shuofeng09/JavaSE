package 设计模式.Factory.exmple.framework;

import 设计模式.Adapter.example.entrust.Print;

/**
 * @author 朔风
 * @createTime 2022-10-05 00:27
 */
public abstract class Factory {

    public final Product create(String s) {
        Product product = createProduct(s);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String name);

    protected abstract void registerProduct(Product product);
}
