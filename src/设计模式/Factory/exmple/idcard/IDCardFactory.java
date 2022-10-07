package 设计模式.Factory.exmple.idcard;

import 设计模式.Factory.exmple.framework.Factory;
import 设计模式.Factory.exmple.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 朔风
 * @createTime 2022-10-05 00:33
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();


    @Override
    protected Product createProduct(String name) {
        return new IDCard(name);
    }

    @Override
    protected void registerProduct(Product product) {
        this.owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
