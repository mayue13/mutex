package Others;

/**
 * Created by mayue on 08-Feb-18.
 */
public class ChocolateMaker {
    public int makeChocolate(int small, int big, int goal) {
       if(goal<big*5){
           return goal;
       }
       else {
           int r = goal - (5 * big);
           if (r > small) {
               int s = small - r;
               return s;
           } else {
               return r;
           }
       }
//        int rem;
//        if(goal>=5*big){
//
//            rem = goal-5*big;
//        }
//        return rem;
    }
}
