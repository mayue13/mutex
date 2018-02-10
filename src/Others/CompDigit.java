package Others;

/**
 * Created by mayue on 08-Feb-18.
 */
public class CompDigit {

    public boolean shareDigit(int num1, int num2) {

        if (num1/10==num2/10||num1/10==num2%10||num1%10==num2/10||num1%10==num2%10)
            return true;
        else
            return false;
    }
}
