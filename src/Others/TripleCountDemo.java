package Others;

/**
 * Created by mayue on 08-Feb-18.
 */
public class TripleCountDemo {
    public static void main(String[] args) {
        TripleCount tripleCount = new TripleCount();

        String str="yreyccccccccc";
        int result=tripleCount.countTriple(str);
        System.out.println(result);
    }
}
