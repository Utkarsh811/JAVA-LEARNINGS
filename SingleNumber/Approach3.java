//Implementing XOR PROPERTIES
// same =>0
// different =>1
// 1^1=0
// 0^0=0
// 1^0=1
// 0^1=1

// anynumber ^0=anynumber
// this method can be used when the question says that in an array all elements are duplicate instead of one element .Find that element.
//and duplicates should appear even number of times




package SingleNumber;
import java.util.*;

public class Approach3 {
    static int singly(int[] nums) {
        int res=0;
        for(int i =0;i<nums.length;i++){
            res=nums[i]^res;
            System.out.println(res);

        }
        return res;
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
        System.out.println("the result is"+singly(nums));

        sc.close();


    
    }

    
}


// leetcode solution
// class Solution {
//     public int singleNumber(int[] nums) {
          
//         HashMap<Integer,Integer> mydict=new HashMap<>();
//         for (int i=0;i<nums.length;i++){
          
//             if(mydict.containsKey(nums[i])){
//                int value= mydict.get(nums[i]);
//                value++;
//                mydict.put(nums[i],value);

                



//             }
//             else{
//                 mydict.put(nums[i],1);
//             }

            
//         }
//         //System.out.println(mydict);
//         for (Map.Entry<Integer,Integer> mapElement : mydict.entrySet()) {          //Traversing Hashmap
//             if(mapElement.getValue()==1){
//             //System.out.println(mapElement.getKey());
//             return mapElement.getKey(); }
//         }
//         return 0;
        
//     }
// }