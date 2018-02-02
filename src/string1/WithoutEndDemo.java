package string1;

class End{

    String withoutEnd(String str){

        int i=str.length();
        return (str.substring(1,i-1));
    }
}
public class WithoutEndDemo {
    public static void main(String[] args) {
        End obj=new End();
        System.out.println(obj.withoutEnd("mayur"));
    }
}
