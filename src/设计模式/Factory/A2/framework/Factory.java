package 设计模式.Factory.A2.framework;

/**
 * @author 朔风
 * @createTime 2022-10-05 00:27
 */
public abstract class Factory {

    public final Product create(String s, String id) {
        Product product = createProduct(s, id);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String name, String id);

    protected abstract void registerProduct(Product product);
}
