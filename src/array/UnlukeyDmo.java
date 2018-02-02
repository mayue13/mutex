import java.util.Scanner;

class Unluckey{
    boolean unluckey1(int[] arr){
        int i=0;
        for (int j=0;j<arr.length;j++){
            if (arr[0]==1){
                if (arr[1]==3){
                    return true;
                }
            }
            if (arr[0]==1){
                if (arr[1]==3){
                    return true;
                }
            }
            if (arr[1]==1){
                if (arr[2]==3){
                    return true;
                }
            }
            if (arr[arr.length-2]==1){
                if (arr[arr.length-1]==3){
                    return true;
                }
            }
            if (arr[arr.length-3]==1){
                if (arr[arr.length-2]==3){
                    return true;
                }
            }

        }
        return false;
    }
}
public class UnlukeyDmo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Unluckey obj = new Unluckey();

        System.out.print("Enter Size of Array :");
        int size = sc.nextInt();

        System.out.print("Enter Array Element:");
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        boolean result=obj.unluckey1(arr);
        System.out.print(result);

}}