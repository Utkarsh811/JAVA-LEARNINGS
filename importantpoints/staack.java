package importantpoints;
import java.util.*;
//implementation of stack in data structures

public class staack {
    public static void main(String[] args){
        Stack<Integer> stk=new Stack<Integer>();
        for(int i=0;i<10;i++){
            stk.push(i);
        }
        System.out.println(stk);
        

        while(!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }
        System.out.println(stk);

    }
    
}
