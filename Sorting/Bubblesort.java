//Bubble sort 
//repeatedly swap 2 adjacent elements if they are in wrong order
//wrong order means if(left side>right side)
//** After every iteration we get  the one sort element highest element at last position
// 2 loops means 2nd most highest element
//For array of size 6 , we need 5 iterations
//for n elements->n-1 iterations in total
//O(n^2)



package Sorting;
import java.util.*;

public class Bubblesort {
    public static int[] bubblessort(int[] nums){
        System.out.println(Arrays.toString(nums));
        long n=nums.length;
        for(int i=1;i<=n-1;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp;
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(nums));
            
            
        }
       
        return nums;
        


    }
    public static void main(String[] args)
    {
        int[] arr={42,64,21,62,21,64,75,21};
        bubblessort(arr);



    }
    
}
