package 设计模式.Factory.A2.idcard;


import 设计模式.Factory.A2.framework.Factory;
import 设计模式.Factory.A2.framework.Product;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 朔风
 * @createTime 2022-10-05 00:33
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    private Map<String, String> map = new HashMap<>();


    @Override
    protected Product createProduct(String name, String id) {
        return new IDCard(name, id);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        this.owners.add(card.getOwner());
        this.map.put(card.getId(), card.getOwner());
    }

    public List getOwners() {
        return owners;
    }

    public Map getMaps() {
        return map;
    }
}
