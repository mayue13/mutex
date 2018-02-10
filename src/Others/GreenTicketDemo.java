package Others;

/**
 * Created by mayue on 08-Feb-18.
 */
public class GreenTicketDemo {
    public static void main(String[] args) {
        LotteryTicket lotteryTicket = new LotteryTicket();

        int i=lotteryTicket.greenTicket(15,15,15);
        System.out.println(i);
    }
}
