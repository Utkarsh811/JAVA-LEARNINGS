package SingleNumber;
import java.util.*;

public class approach1 {
    static void singly(int[] nums) {
        
        HashMap<Integer,Integer> mydict=new HashMap<>();
        for (int i=0;i<nums.length;i++){
          
            if(mydict.containsKey(nums[i])){
               int value= mydict.get(nums[i]);
               value++;
               mydict.put(nums[i],value);

                



            }
            else{
                mydict.put(nums[i],1);
            }

            
        }
        System.out.println(mydict);
        for (Map.Entry<Integer,Integer> mapElement : mydict.entrySet()) {          //Traversing Hashmap
            if(mapElement.getValue()==1){
            System.out.println(mapElement.getKey());}
        }
        





    }
   

    public static void main(String args[]) {
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