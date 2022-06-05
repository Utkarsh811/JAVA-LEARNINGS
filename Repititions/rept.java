package Repititions;

import java.util.*;

public class rept {
    static void singly(String str) {
        System.out.println(str);
        // String strie;
        // strie=str.split("");

        HashMap<Character, Integer> mydict = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (mydict.containsKey(str.charAt(i))) {
                int value = mydict.get(str.charAt(i));
                value++;
                mydict.put(str.charAt(i), value);

            } else {
                mydict.put(str.charAt(i), 1);
            }

        }
        System.out.println(mydict);
        int count=0;
        int temp=-9097098;
        char keey='c';
        int val=-32324242;
        // for (Map.Entry<Character,Integer> mapElement : mydict.entrySet())

        // {          //Traversing Hashmap
        //     //System.out.println(temp);
        //     if(count==0){
        //          val =mapElement.getValue();
        //         keey=mapElement.getKey();
        //         temp=val;

        //         count=1;

        //     }
        //     if(count==1){
        //         System.out.println("gvhjvhjvjv"+val);
        //         val =mapElement.getValue();
               
        //         if(val>temp){
        //             keey=mapElement.getKey();
        //             temp=val;
        //         }

        //     }


           
            

            //System.out.println(mapElement.getKey());
        //}

        System.out.println(mydict.entrySet());
        Iterator it=mydict.entrySet().iterator();
        System.out.println(it);
        while(it.hasNext()){
             Map.Entry<Character,Integer> el = (Map.Entry) it.next(); 
             if(count==0){
             val=el.getValue();
             keey=el.getKey();
             temp=val;
            count=1;}
             else{
                val=el.getValue();
             if(val>temp){
                 temp=val;
                 keey=el.getKey();
             }}



            
              

        }
        System.out.println(temp+","+keey);
        //ArrayList<Character> liist=new ArrayList<Character>(mydict.keySet());
        // System.out.println(mydict.get(liist.get(0)));


        
        //System.out.printf("%d,%c",temp,keey);
        


    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        singly(str);

        sc.close();
    }

}
