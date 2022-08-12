package LinkedList;

import java.util.*;

public class Implementll {

  //creation of LinkedList
  public static class Node {/*Node class */

    int data;
    Node next;
  }

  public static class linkedlist {/*Linked List class */

    static Node head;
    static Node tail;
    static int size;

    public static void addList(int value) {
      Node node1 = new Node();
      node1.data = value;
      node1.next = null;
      if (size == 0) {
        head = node1;
        tail = node1;
      } else {
        tail.next = node1;
        tail = node1;
      }
      size++;

    }

    public static void display(linkedlist list1) 
    {
      Node traverse=new Node();
      traverse = head;
      while (traverse != null) {
        if (traverse.next == null) {
          System.out.println(traverse.data);
          traverse = traverse.next;
        } else {
          System.out.print(traverse.data + "->");
          traverse = traverse.next;
        }
      }
    }

    /*Inserting elements in the list 
     * has 3 cases
     * 1.Insert at first position
     * 2.Insert at middle position anywhere
     * 3. Insert at last position
     */

    public static void Insert(int index,int val1)
    //Inserting at first index
    {
        Node nodel=new Node();
        if(size!=0 && index==1){
            nodel.data=val1;
            nodel.next=head;
            head=nodel;
            size++;

        }
        else if(size!=0 && (index>1 && index< size)){
            //2.Insert at middle position anywhere
            Node pointer=new Node();
            pointer=head;
            int count=1;
            while(count<index-1){
                pointer=pointer.next;
                count++;
            }
            Node newnode=new Node();
            newnode.data=val1;
            newnode.next=pointer.next;
            pointer.next=newnode;
            size++;

    


        }
        else if(size!=0 && index==size)
        {
           // 3. Insert at last position
           Node lastnode=new Node();
           lastnode.data=val1;
           lastnode.next=null;
           tail.next=lastnode;
           size++;

        }
        else{
            System.out.println("The Linked List is empty");
        }




    }
    public static void size()
    {
        System.out.println(size);
    }

    /*Deletion from the Linked List contain 3 cases
     * 1.Deletion of the 1st index
     * 2.Deletion of the 2nd index
     * 3.Deletion of the 3rd index
     */
    public static void remove(int indezz)
    {
        /*  1.Deletion of the 1st index*/
        if(size!=0 && indezz==1){

          if(size==1)
          {
            head=tail=null;
            size--;

          }
          else{
            Node deletenode=new Node();
            deletenode=head;
            head=head.next;
            System.out.println("the deleted element is "+deletenode.data);
            deletenode.next=null;
            size--;
          }
        }
        else if(size!=0 && (indezz>1 && indezz<size))
        {
            int count=1;
            Node temp=new Node();
            temp=head;
            Node pemt=new Node();

            while(count<indezz-1)
            {
                temp=temp.next;

                

                count++;

            }
            pemt=temp.next;
            //System.out.println(temp.data+""+pemt.data);
            temp.next=pemt.next;
            size--;
            pemt.next=null;
            int deletedvalue=pemt.data;
            System.out.println("the deleted element is "+deletedvalue);
          



        }
        else if(size!=0 && indezz==size){
            int cnt=1;
            Node Lstemp=new Node();
            Lstemp=head;
            while(cnt<size-1){
                Lstemp=Lstemp.next;
                cnt++;

            }
            System.out.println("the deleted element is "+tail.data);
          
            
            tail=Lstemp;
            tail.next=null;
            size--;



        }
        else{
            System.out.println("The Linked List is empty");

        }
    }

 
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    linkedlist list1 = new linkedlist();
    System.out.println("1.Index is starting from 1 to size ");
 
    System.out.println("2.For ending Type-: end ");
    System.out.println("3.For creating and adding elements Type-: for eg Add 34 ");
    System.out.println("4.For Inserting at any position Type-: Insert 1 34 (1 is index and other element) ");
    System.out.println("5.For displaying Linked List Type-: DisplayAll ");
    System.out.println("6.For size Type-: Size ");
    
    System.out.println("7.For Deleting element Type-:for eg Remove 1 (here 1 is index.Give the index)");

    String command = sc.nextLine();

    while (!command.equals("end")) 
    {
      if (command.startsWith("Add")) 
      {
        String[] arr = command.split(" ");
        int val = Integer.parseInt(arr[1]);

        list1.addList(val);/*Creation of the list adding elements in the list one by one */
      }
      if(command.startsWith("Insert")){
       
          int val1=Integer.parseInt(command.split(" ")[2]);
          int index=Integer.parseInt(command.split(" ")[1]);
          list1.Insert(index,val1);

      }
      if(command.startsWith("DisplayAll")){
        
        list1.display(list1);

    }
    if(command.startsWith("Size")){
        
        list1.size();

    }
    if(command.startsWith("Remove")){
        int indezz=Integer.parseInt(command.split(" ")[1]);
        
        list1.remove(indezz);

    }
      
      command = sc.nextLine();
    }
    
    sc.close();
  }
}
