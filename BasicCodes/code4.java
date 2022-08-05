import java.util.*;

public class code4 {
    public static int func(int[] arr, int input2){
        ArrayList<Integer> lst=new ArrayList<Integer>();
    
        for(int i=0;i<input2;i++)
        {
            int val=arr[i];
            boolean flag=false;
            for(int j=2;j<=val/2;++j){
                if(val%j==0){
                    flag=true;
                    break;

                }

            }
            if(!flag){
          
                
                lst.add(arr[i]);


            }
        }
        if(lst.isEmpty()){
            int mus=0;
            int small=-1;
            //find minimum element
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int i=0;i<arr.length;i++)
            {
                pq.add(arr[i]);

            }
            small=pq.peek();
            System.out.println(small);
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==small)continue;
                else
                mus=mus+arr[i];
            }
            return mus;
            
        
        }
        else{
        int sum=0;
        int smallest=Collections.min(lst);
        System.out.println(smallest);
       
        for(int i=0;i<lst.size();i++){
            if(lst.get(i)==smallest){
                continue;
            }
            else
            sum=sum+lst.get(i);
        }
        
        System.out.println(lst);
        //System.out.println(sum);
        return sum;
    }
       
        

    }
    public static void main(String[] args){
        int[] arr=new int[]{4,12,26,102,193,72,71,73,107,212,15,108,223,53,81};
        
        System.out.println("the sum is="+func(arr,15));

    }
    
}
