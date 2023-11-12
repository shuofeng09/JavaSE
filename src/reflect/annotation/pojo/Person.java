package reflect.annotation.pojo;

//表名为PersonTable
@TableName("PersonTable")
public class Person {

    //设置三个字段的相关信息
    @ColumnInfo(columnName = "姓名", type = "varchar", length = 20)
    private String name;
    @ColumnInfo(columnName = "身份证号", type = "int", length = 5)
    private int id;
    @ColumnInfo(columnName = "年龄", type = "int", length = 3)
    private int age;

    @MethodInfo(value = "getAge", info = "获取年龄")
    public int getAge() {
        return age;
    }

    @MethodInfo(value = "getName", info = "获取姓名")
    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }
    //
    // @MethodInfo(value = "getId", info = "获取id")
    // public int getId() {
    //     return id;
    // }
    //
    // public void setId(int id) {
    //     this.id = id;
    // }
    //
    // public void setAge(int age) {
    //     this.age = age;
    // }
}
