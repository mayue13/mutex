/**
 * Created by mayue on 30-Jan-18.
 */

    class StringDemo {
    public static void main(String Sr[]) {

        //String constants are stored into pul
        String str = "mutex";
        String str1 = "mutex";
        System.out.println(str == str1); //will return true

        //Stored into heap
        String s1 = new String("mutex");
        String s2 = new String("mutex");

        System.out.println(s1 == s2);

        s1.concat("Infotech");
        System.out.println(s1); //print mutex -> Stringis immutable
        //in behaviour

        s1 = s1.concat(" Infotech"); //need to reassign to take effect o/p : mutexInfotech
        System.out.println(s1);

    }
}
