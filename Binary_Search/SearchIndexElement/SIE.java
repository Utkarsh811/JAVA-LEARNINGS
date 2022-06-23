//we use binary search to find the correct index of the element if element not present in the array in O(log n) time complexity


// 1 2 4 7 8 9
// 0 1 2 3 4 5


//always return lower when array is in ascending order and you are returning the accurate index of an element
package Binary_Search.SearchIndexElement;
import java.util.*;
public class SIE {
    static int searchInsert(int[] nums, int target) {
       
            int lower =0;
            int higher=nums.length-1;
            int mid=0;
            while(lower<=higher){
                mid=lower+(higher-lower)/2;
                if(target==nums[mid]){
                    return mid;
                }
                else if(target>nums[mid]){
                    lower=mid+1;
                }
                else{
                    higher=mid-1;
                }
            }
            System.out.println("lower now=>"+lower+"higher now=>"+higher);
            //if(target>nums[higher]){
                return lower;
           // }
           // else{
              //  return higher;
            //}

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int target;
        int size=sc.nextInt();
        int value=0;
        int[] nums=new int[size];
        for(int i=0;i<size;i++){
            value=sc.nextInt();
            nums[i]=value;
            

        }
        target=sc.nextInt();
        System.out.println("Index is "+searchInsert(nums,target));

        sc.close();

    }
    
}
