import java.util.Scanner;

class ArrayAdd{
    int[]  result;

    int[] pluseArray(int[] a,int[] b){
        int i=0;
        result = new int[a.length+b.length];
        for (int element:a){
            result[i++]=element;
        }
        for (int element:b){
            result[i++]=element;
        }

        return result;
    }
}
public class ArrayAddDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayAdd obj = new ArrayAdd();

        System.out.print("Enter Size of Array 1 :");
        int size = sc.nextInt();

        System.out.print("Enter Array Element:");
        int[] a=new int[size];
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter Size of Array 2 :");
        size = sc.nextInt();

        System.out.print("Enter Array Element:");
        int[] b=new int[size];
        for (int i=0;i<size;i++){
            b[i]=sc.nextInt();
        }

        int[] resultArray=obj.pluseArray(a,b);

        System.out.print("\nResult array : ");
        for (int element:resultArray){
            System.out.print(element+" ");
        }

    }
}
