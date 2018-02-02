package string1;

class RepeatSep{
    String repeatSeparator(String word,String sep,int count){
        String result=new String(word);


            result.concat(word);
            for (int j = 1; j<count ; j++) {
                result=result.concat(sep);
                result=result.concat(word);
            }

        return result;

    }
}
public class RepeatSepDemo {
    public static void main(String[] args) {

        RepeatSep obj=new RepeatSep();
        System.out.println(obj.repeatSeparator("mayur","13",1));
    }

}
