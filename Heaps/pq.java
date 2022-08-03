package Heaps;
import java.util.*;




public class pq {
    public static void minpq(int[] arr)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(); //MIN HEAP
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
            System.out.println(pq.peek());//peek function return the top element 
        }
        System.out.println(pq);//print the level order of the priority queue
    }

    public static void maxpq(int[] arr)
    {
        PriorityQueue<Integer> qp=new PriorityQueue<Integer>(Collections.reverseOrder());//max heap
        for(int i=0;i<arr.length;i++)
        {
            qp.add(arr[i]);
            System.out.println(qp.peek());//peek function return the top element 
        }
        System.out.println(qp);//print the level order of the priority queue
    }
    public static void ksmallest(int[] arr,int k)
    {
        PriorityQueue<Integer> qp=new PriorityQueue<Integer>(Collections.reverseOrder());//max heap
        for(int i=0;i<arr.length;i++)
        {
            qp.add(arr[i]);
            if(qp.size()>k){
                System.out.println(qp.poll()); //pop the top element and also return it
            }
            System.out.println(qp.peek());//peek function return the top element 
        }

        System.out.println("the kth smallest element is-:"+qp.peek());

    }
    public static void kLargest(int[] arr,int k)
    {
        PriorityQueue<Integer> mqp=new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
        mqp.add(arr[i]);
        
        if(mqp.size()>k){
            mqp.poll();
        }}
        System.out.println("the largest kth is"+mqp.peek());

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={89,2,43,1,3};
        System.out.println("Enter the k value");
        int k=sc.nextInt();
        minpq(arr);
        maxpq(arr);
        ksmallest(arr,k);
        kLargest(arr,k);
        sc.close();

    }
    
}
