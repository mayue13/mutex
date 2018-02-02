package string1;

class CommanEnd{

    boolean frontAgain(String str){

        int len=str.length();
        String s1=str.substring(0,2);
        String s2=str.substring(len-2,len);
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2))
           return true;
        else
            return false;


    }
}

public class CommonEndDemo {
    public static void main(String[] args) {
        CommanEnd obj=new CommanEnd();
        System.out.println(obj.frontAgain("mayur1ma4"));
    }
}
