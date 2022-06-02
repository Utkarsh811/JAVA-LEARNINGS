package Concepts;
import java.util.*;

public class Hasmap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        HashMap <String,Integer> mydict = new HashMap<>();
        mydict.put("Utkarsh", 900);
        for (int i=0;i<5;i++){
            //System.out.println("The key  "+i+"-:");

            String key= sc.nextLine();
            //System.out.println("The value  "+i+"-:");
            int value = sc.nextInt();
            mydict.put(key, value);

        }
        System.out.println(mydict);
        sc.close();
    }

    
}
