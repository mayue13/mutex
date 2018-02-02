import java.util.Scanner;

class ArrayMerge{
    int[]  result;

    int[] alterMerge(int[] a,int[] b){

        result = new int[a.length+b.length];
        int j=0;
        for (int i=0;i<a.length||i<b.length;i++){
           if (i<a.length)
              result[j++]=a[i];
           if (i<b.length)
            result[j++]=b[i];
        }
        return result;
    }
}
public class MergeDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayMerge obj = new ArrayMerge();

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

        int[] resultArray=obj.alterMerge(a,b);

        System.out.print("\nResult array : ");
        for (int element:resultArray){
            System.out.print(element+" ");
        }

    }
}
