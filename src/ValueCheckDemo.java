import java.util.Scanner;

class ValueCkeck{

    boolean isEverywhere(int[] arr,int value){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                if (arr[i]==value||arr[++i]==value)
                    temp=1;

            }

        }

        if (temp==1)
            return true;
        else
            return false;

    }
}

public class ValueCheckDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ValueCkeck obj = new ValueCkeck();

        System.out.print("Enter Size of Array :");
        int size = sc.nextInt();

        System.out.print("Enter Array Element:");
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Value to be search:");
        int value=sc.nextInt();

        boolean result=obj.isEverywhere(arr,value);
        System.out.print(result);

    }

}
