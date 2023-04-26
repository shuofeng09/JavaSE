package day04.stream;

import day04.stream.entity.Author;
import day04.stream.entity.Book;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 朔风
 * @createTime 2023-01-03 17:04
 */
public class quick_start {
    /**
     * 查询未成年作家评分在70分以上的书籍，由于流的影响所以作家和书籍可能会重复出现，所以要去重.
     */
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Author> authorList = new ArrayList<>();
        Set<Book> uniqueBookValues = new HashSet<>();
        Set<Author> uniqueAuthorValues = new HashSet<>();
        for (Author author : authorList) {
            // 这里如果重复就不会添加成功
            if (uniqueAuthorValues.add(author)) {
                if (author.getAge() < 18) {
                    List<Book> books = author.getBookList();
                    for (Book book : books) {
                        if (book.getScore() > 70D) {
                            // 如果之前有这本书就不会再次添加
                            if (uniqueBookValues.add(book)) {
                                bookList.add(book);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(bookList);

        // 函数式写法
        List<Book> collect = authorList.stream()
                .distinct()
                .filter(author -> author.getAge() < 18)
                .map(author -> author.getBookList())
                .flatMap(Collection::stream)
                .filter(book -> book.getScore() > 70)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
