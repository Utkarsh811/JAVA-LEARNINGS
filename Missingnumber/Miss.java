package Missingnumber;

import java.util.*;

public class Miss {

    static void misscalculation(ArrayList<Integer> liist){
        int var;
        System.out.println(liist);
        //int seze=liist.size();
        
        ArrayList<Integer> least=new ArrayList<Integer>(Collections.nCopies(liist.size()+2, 0));
        // Collections.fill(least, 0);
        //System.out.println(least.size());
        //System.out.println(least);

        for(int i=0;i<liist.size();i++){
            int elem=liist.get(i);
            if(least.get(elem)==0){
                least.set(elem,1);
            }
            else{
                var=least.get(elem);
                var++;
                least.set(elem,var);
                
            }



        }
     

        //System.out.println(least);
        String strie="";
        String straw="";
        for(int i=1;i<least.size();i++){
            if(least.get(i)==0){
                strie=strie+i+",";
                
            }
            if(least.get(i)>1){
                straw=straw+i+",";

            }
        }
        
        System.out.printf("The missing elements are %s\n",strie);
        System.out.printf("The repeated elements are %s\n",straw);

        



        








    }
    public static void main(String args[]){
    ArrayList<Integer> liist=new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    for (int i=0;i<size-1;i++){
        System.out.printf("Enter input "+i+"-:");
        int element = sc.nextInt();
        liist.add(element);

    }
    misscalculation(liist);
    sc.close();

    }



    
}
