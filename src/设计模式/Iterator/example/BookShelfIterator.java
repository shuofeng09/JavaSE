package 设计模式.Iterator.example;

/**
 * @author 朔风
 * @createTime 2022-10-03 23:14
 */
public class BookShelfIterator implements Iterator {

    //表示所要遍历的书架
    private BookShelf bookShelf;

    //表示迭代器当前指向的书籍的下标
    private int index;

    //初始化迭代器
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
