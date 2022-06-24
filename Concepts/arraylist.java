package Concepts;
import java.util.*;
public class arraylist{

  

    public static void main(String args[]){
        ArrayList <Integer> list1 = new ArrayList<Integer>();
        System.out.println(list1);
        for(int i=0;i<10;i++){
            list1.add(i);
            System.out.println(list1);
        }

        list1.set(3,4234242);
        System.out.println(list1);
        System.out.println(list1.remove(5));
        System.out.println(list1.get(5));
        


        String str="utkarsh";
        System.out.println(str);
        //System.out.println(id(str));
        // System.identityHashCode(str);
        // str="jbfjsfjkasnf";
        // System.out.println(str);
        // System.identityHashCode(str);

        

    }

 

  
    

}