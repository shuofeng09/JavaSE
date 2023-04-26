package day04.stream;

import day04.stream.entity.Author;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author 朔风
 * @createTime 2023-01-03 17:59
 */
public class Stream02 {

    private List<Author> authorList;

    @Before
    public void before() {
        Author author1 = new Author(12, "亚索", "死亡如风常伴吾身", 32, null);
        Author author2 = new Author(13, "梦多", "一个拿菜刀的祖安人", 40, null);
        Author author3 = new Author(11, "拉克丝", "德玛西亚！", 18, null);
        Author author4 = new Author(10, "伊泽瑞尔", "像我这么帅的都是主角哦", 19, null);
        Author author5 = new Author(14, "易", "", 30, null);
        Author author6 = new Author(15, "劫", "无形之刃最为致命", 27, null);
        Author author7 = new Author(15, "劫", "无形之刃最为致命", 27, null);
        authorList = Arrays.asList(author1, author2, author3, author4, author5, author6, author7);
    }

    @Test
    public void test01() {
        /*
         * 过滤操作：过滤出年龄大于30的作者
         */
        authorList.stream()
                .filter(author -> author.getAge() > 30)
                .forEach(System.out::println);
        /*
         * 过滤出名字为拉克丝的作者
         */
        authorList.stream()
                .filter(author -> author.getName().equals("拉克丝"))
                .forEach(System.out::println);
    }

    @Test
    public void test02() {
        /*
         * 去重操作：去除流中相同的元素
         */
        authorList.stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test03() {
        /*
         * 数据变换
         */
        authorList.stream()
                .distinct()
                .map(Author::getName).forEach(System.out::println);
    }
}
