package 设计模式.singleton.A1;

/**
 * @author 朔风
 * @createTime 2022-10-05 15:02
 */
public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {

    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }



}
