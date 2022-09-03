package LinkedList.CreationodLinkedList;

public class List {
    Node Head=new Node();
    Node Tail=new Node();
    static int size=0;

    //Creating a list in starting
    public  void create(int vals ){
        //create a new node
        Node newnode=new Node();
        newnode.value=vals;
        newnode.next=null;
        if(size==0){
            Head=newnode;
            Tail=newnode;


        }
        else{
            Tail.next=newnode;
            Tail=newnode;

        }
        
        
        size++;
    }
    public void display(){
        Node temp=new Node();
        temp=Head;
        while(temp!=null)
        {
            if(temp.next==null)
            {
                System.out.println(temp.value);
            }
            else{
            System.out.println(temp.value+"->");
            }
            
            temp=temp.next;
        }
        
    }

    
}
