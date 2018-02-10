package Others;

/**
 * Created by mayue on 08-Feb-18.
 */
public class TripleCount {
    public int countTriple(String str) {

        int count=0;

        for (int i = 0; i <str.length()-2; i++) {

            //char a=str.charAt(i);
            //char b=str.charAt(i+1);
            //char c=str.charAt(i+2);

            if (str.charAt(i)==str.charAt(i+1)&&str.charAt(i+1)==str.charAt(i+2)){
                count++;
            }

        }
        return count;
    }
}
