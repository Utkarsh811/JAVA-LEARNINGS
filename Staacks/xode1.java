package Staacks;
//Implementation of Stack using Linked List
import java.util.*;

public class xode1 {
    public static class Node{
        int data;
        Node next;
      
        public Node(int  value){
            this.data=value;
            this.next=null;
        }

    }
    public static class Stack{
        static Node Head=null;
        //static Node Tail;
        static int size=0;
        public static void push(int data){
            //if stack is empty
            if(Head==null){
                Node ndy=new Node(data);
                Head=ndy;
                size++;
            }
            else{
                Node ndy=new Node(data);
                ndy.next=Head;
                Head=ndy;
                size++;

            }

        }
        public static void pop(){
            if(Head==null){
                System.out.println("The Stack is empty");

                
            }
            else{
                System.out.println("The deleted element is"+Head.data);
                Head=Head.next;
                size--;

            }


        }
        public static void peek(){
            System.out.println("The element at the top is"+Head.data);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String command=sc.nextLine();
        Stack stk=new Stack();
        while(!command.equals("end")){
            if(command.startsWith("Push")){
               int value= Integer.parseInt(command.split(" ")[1]);
                stk.push(value);

            }
            if(command.startsWith("Pop")){
              
                 stk.pop();
 
             }
             if(command.startsWith("Peek")){

                 stk.peek();
 
             }
            command=sc.nextLine();
            

        }

        //Traversing Stack
        // while(stk.Head!=null){
        //     System.out.println(stk.peek());
        //     stk.pop();
        // }
        sc.close();
      
        
         
      
    }
    
}


