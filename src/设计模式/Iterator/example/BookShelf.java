package 设计模式.Iterator.example;

/**
 * @author 朔风
 * @createTime 2022-10-03 23:04
 */
public class BookShelf implements Aggregate {

    private Book[] books;

    //书架的下一个空位
    private int last = 0;

    //初始化book数组
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    //获取指定位置的书籍
    public Book getBookAt(int index) {
        return this.books[index];
    }

    //添加书籍
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    //返回书籍的数量
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
