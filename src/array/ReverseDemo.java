import java.util.Scanner;

class Reverse{

    int temp;

    public int[] reverseArray(int[] nums){
       
      for(int i=0,j=nums.length-1;i<j;i++,j--){
           temp=nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
           
       }
        return nums;
    }

}

public class ReverseDemo {
    public static void main(String[] args){

        Reverse obj= new Reverse();
        Scanner sc= new Scanner(System.in);
        int[] nums = new int[3];

        System.out.println("Enter 3 Array Element :");
        for (int i=0;i<nums.length;i++) {
            nums[i] = sc.nextInt();
        }
        new String();

        System.out.print("Original Array :");
        for(int element:nums){
            System.out.print(element + " ");
        }
        nums=obj.reverseArray(nums);

        System.out.print("\n Reverse Array :");
        for(int element:nums){
            System.out.print(element + " ");
        }

    }


}
