package Singlenumber3;
import java.util.*;

public class sn3 {
    static void singly(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        int temp=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(temp==nums[i]){
                count++;
            }
           temp=nums[i];
           if(temp!=nums[i]){
               count=0;
           }

        
            

           

        }

    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("enter input1 " + i + "-:");
            int elem = sc.nextInt();
            nums[i] = elem;

        }
        singly(nums);

        sc.close();

    }
    
}
