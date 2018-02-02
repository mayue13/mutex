package string1;

class Balance{


   boolean xyBalance(String str){

       int i=str.lastIndexOf('x');
       int j=str.lastIndexOf('y');

       if (i<j)
           return true;
       else
           return false;

   }
}
public class BalanceDemo
{
    public static void main(String[] args) {
        Balance obj=new Balance();
        System.out.println(obj.xyBalance("ndfhjfdsxhjkdfhjxjdsfhjyxdfhk"));
    }
}
