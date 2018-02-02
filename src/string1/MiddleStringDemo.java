package string1;

class MiddleString{

    String middleThree(String str){

        int i=str.length()/2;
        String result=str.substring(i-1,i+2);

              return result;

    }
}


public class MiddleStringDemo {

    public static void main(String[] args) {

        MiddleString obj = new MiddleString();
        System.out.println(obj.middleThree("as19876wer75"));

    }
}
