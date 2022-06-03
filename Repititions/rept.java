package Repititions;
import java.util.*;

public class rept {
    static void singly(String str){
        System.out.println(str);
        // String strie;
        // strie=str.split("");
  
        HashMap<Character,Integer> mydict=new HashMap<Character,Integer>();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if(mydict.containsKey(str.charAt(i))){
                int value= mydict.get(str.charAt(i));
                value++;
                mydict.put(str.charAt(i),value);
 

            }
            else{
                mydict.put(str.charAt(i),1);
            }

          }
          System.out.println(mydict);          
   


      
    }


     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
     
        
        singly(str);

        sc.close();
    }


    
}
