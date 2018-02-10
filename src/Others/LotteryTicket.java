package Others;

/**
 * Created by mayue on 08-Feb-18.
 */
public class LotteryTicket {
    public int greenTicket(int a, int b, int c) {

        if (a==b&&b==c) {
            return 20;
        }
        else
        if (a+b==c||b+c==a||a+c==b){
            return 10;
        }
        else
            return 0;

    }
}
