import java.util.Scanner;

class Fix{

    int[] fix23(int[] arr){

        for (int i=0;i<arr.length;i++){

            if (arr[i]==2){
                if (arr[i+1]==3){
                    arr[i+1]=0;
                }

            }
        }
        return arr;

    }
}
public class Fix23Demo {
    public static void main(String[] args) {
        Fix obj= new Fix();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array :");
        int size = sc.nextInt();

        System.out.print("Enter Array Element:");
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("original array : ");
        for (int element:arr){
            System.out.print(element+" ");
        }

        int[] resultArr=new int[arr.length];
        resultArr=obj.fix23(arr);



        System.out.print("\nResult array : ");
        for (int element:resultArr){
            System.out.print(element+" ");
        }
    }
}
