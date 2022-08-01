
import java.util.*;


public class Scanner1 {
    public static void main(String args[]){
        System.out.println("Hello Mr,Mrs !What is your name?");
        Scanner c= new Scanner(System.in);
        // Set s= new HashSet();
        // s.add("apple");
        // s.add("apple");
        // s.add("mango");
        //System.out.println(s);
        Object a= new HashSet();
        System.out.println((a instanceof Set)+ ",");
        System.out.println(a instanceof SortedSet);

       String name = c.next();
       System.out.println("Hello "+name+"How are you?"+name);
       c.close();


    }
    
}
