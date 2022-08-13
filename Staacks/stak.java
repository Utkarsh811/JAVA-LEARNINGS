package Staacks;
import java.util.*;

public class stak {
    public static void main(String[] args){

    Stack<Integer> netk=new Stack<>();
    netk.push(1);
    netk.push(2);
    for(int i=4;i<10;i++){
        netk.push(i);
    }
    System.out.println(netk);
    System.out.println(netk.peek());
    System.out.println(netk.pop());
    while(!netk.isEmpty()){
        System.out.println(netk.peek());
        netk.pop();

    }


    }
    
    



    
}
