package test;

import java.util.HashMap;

/**
 * @author 朔风
 * @createTime 2022-08-01 13:48
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return user.getName().equals(this.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }


    public static void main(String[] args) {
        HashMap<User, String> hashMap = new HashMap<>();
        hashMap.put(new User("xz"), "123");

        System.out.println(hashMap.get(new User("xz")));

    }
}
