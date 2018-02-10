package Others;

/**
 * Created by mayue on 08-Feb-18.
 */
public class StringAnagram {
    public boolean checkAnagram(String str1, String str2) {

       // if (str1.length()!=str2.length())
         //   return false;
        int temp = 0;
        for (int i = 0; i <str1.length() ; i++) {

            temp=0;
            for (int j = 0; j <str2.length() ; j++) {

                if (str1.charAt(i)==str2.charAt(j)){
                    temp=1;
                    break;
                }

            }
            if (temp==0)
                return false;

        }

        if (temp==1){
            return true;
        }
        else
            return false;

    }
}
