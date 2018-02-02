package string1;

class SeeColor{

    String seeColor(String str){

        if (str.startsWith("red"))
            return "red";
        if(str.startsWith("blue"))
            return "blue";

            return "";
    }

}
public class ColorDemo {
    public static void main(String[] args) {

        SeeColor obj=new SeeColor();
        System.out.println("color return :"+obj.seeColor("redmayured"));
    }
}
