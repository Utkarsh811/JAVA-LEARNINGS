
import java.util.*;


public class Scanner1 {
    public static void main(String args[]){
        System.out.println("Hello Mr,Mrs !What is your name?");
        Scanner c= new Scanner(System.in);
       String name = c.next();
       System.out.println("Hello "+name+"How are you?"+name);
       c.close();


    }
    
}
