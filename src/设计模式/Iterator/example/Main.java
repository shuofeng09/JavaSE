package 设计模式.Iterator.example;

/**
 * @author 朔风
 * @createTime 2022-10-03 23:24
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Java入门基础"));
        bookShelf.appendBook(new Book("C++从入门到精通"));
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("深入理解JVM虚拟机"));
        bookShelf.appendBook(new Book("Java代码审计"));

        //获取bookShelf的迭代器
        Iterator iterator = bookShelf.iterator();

        //遍历书架中的书本
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }

    }
}
