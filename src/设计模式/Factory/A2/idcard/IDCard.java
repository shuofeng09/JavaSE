package 设计模式.Factory.A2.idcard;


import 设计模式.Factory.A2.framework.Product;

/**
 * @author 朔风
 * @createTime 2022-10-05 00:33
 */
public class IDCard extends Product {

    private String owner;

    private String id;

    IDCard(String owner,String id) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public String getId() {
        return id;
    }


}
