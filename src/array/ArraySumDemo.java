import java.util.Scanner;

class ArraySum{

    int sum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==6){
                while(arr[i]!=7){
                    i++;
                }
                i++;
             }
            sum+=arr[i];
        }
        return sum;
    }
}
public class ArraySumDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArraySum obj = new ArraySum();

        System.out.print("Enter Size of Array :");
        int size = sc.nextInt();

        System.out.print("Enter Array Element:");
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int result=obj.sum(arr);
        System.out.print(result);

    }
}
