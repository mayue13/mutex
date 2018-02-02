import java.util.Scanner;

class Check{

    public boolean commonEnd(int[] a, int[] b) {

        if (a[0]==b[0]||a[a.length-1]==b[b.length-1]){
            return true;
        }
        else
            return false;
    }
}
public class CheckDemo {
    public static void main(String[] args) {
        Check obj = new Check();
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Size of Array :");
        int size = sc.nextInt();

        System.out.print("Enter Array Element:");
        int[] a = new int[size];
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter Size of Array :");
        size = sc.nextInt();

        System.out.print("Enter Array Element:");
        int[] b = new int[size];
        for (int i=0;i<size;i++){
            b[i]=sc.nextInt();
        }

        boolean result = obj.commonEnd(a,b);
        System.out.print("Common End is : "+ result);

    }
}
