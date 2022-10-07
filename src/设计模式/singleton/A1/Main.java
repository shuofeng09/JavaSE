package 设计模式.singleton.A1;

/**
 * @author 朔风
 * @createTime 2022-10-05 15:05
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");
    }
}
