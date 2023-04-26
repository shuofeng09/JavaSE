package day04.stream;

import day04.stream.entity.Author;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author 朔风
 * @createTime 2023-01-03 17:41
 */
public class Stream01 {

    @Test
    public void test01() {
        List<Author> authorList = new ArrayList<>();
        authorList.stream()
                .forEach(System.out::println);

    }

    @Test
    public void test02() {
        Stream.of("11", "22", "33").forEach(System.out::println);
    }

    @Test
    public void test03() {
        IntStream.of(1, 2, 3, 4, 5, 6, 7).forEach(System.out::println);
        DoubleStream.of(1, 2, 3, 4, 5, 6).forEach(System.out::println);
        LongStream.of(6, 5, 4, 3, 2, 1).forEach(System.out::println);
    }

    @Test
    public void test04() {
        String[] arr = {"abc", "qwe", "jkl"};
        Arrays.stream(arr).forEach(System.out::println);
    }
}
