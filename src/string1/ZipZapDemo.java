package string1;

/**
 * Created by mayue on 03-Feb-18.
 */
class DeleteMiddle{

    public StringBuffer zipZap(StringBuffer str) {

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                str.deleteCharAt(i+1);
            }
        }
        return str;
    }
}

public class ZipZapDemo {
    public static void main(String[] args) {
        DeleteMiddle obj=new DeleteMiddle();
        StringBuffer str=new StringBuffer("zippvvzap");
        StringBuffer result=obj.zipZap(str);
        System.out.println(result);
    }
}
