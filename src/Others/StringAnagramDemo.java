package Others;

/**
 * Created by mayue on 08-Feb-18.
 */
public class StringAnagramDemo {
    public static void main(String[] args) {
        StringAnagram stringAnagram = new StringAnagram();

        boolean b = stringAnagram.checkAnagram("abcd", "bqad");
        System.out.println(b);
    }
}
