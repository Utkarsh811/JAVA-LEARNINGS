package Heaps;
//import java.nio.file.Path;
import java.util.*;



class codeheap0{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many largest elements do you want");
        int k=sc.nextInt();

    
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(9,4,10,3,6,5,1,8));
        
    
     
       
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            pq.add(list.get(i));

            if(pq.size()>k){
                pq.poll();

            }
            
            
        }
        System.out.println(pq);
        System.out.println("and Kth largest element is" + " "+pq.peek());
        
       
     



    }
}