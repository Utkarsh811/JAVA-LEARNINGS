//hackerrank question
//Java Sort "https://www.hackerrank.com/challenges/java-sort/problem"

package BasicCodes;
import java.util.*;
import java.io.*;

public class solution1 {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        TreeMap<Integer,String> sorty=new TreeMap<>();
        HashSet<Double> list=new HashSet<>();
        while(T>0)
        {
            String str=br.readLine();
            int id=Integer.parseInt(str.split(" ")[0]);
            String value=str.split(" ")[1]+"_"+str.split(" ")[2];
            list.add(Double.parseDouble(str.split(" ")[2]));
            sorty.put(id,value);
            
            
            T--;
        }
        //System.out.println(sorty);
        ArrayList<Double> newlist=new ArrayList<>(list);
        Collections.sort(newlist,Collections.reverseOrder());
       // System.out.println(list);
        TreeMap<Integer,String> second=new TreeMap<>();
        HashSet<String> names=new HashSet<>();
        
        
        for(double a:newlist)
        {
            String name="";
            second.clear();
            names.clear();
            for(Map.Entry<Integer,String> var:sorty.entrySet())
            {
                double val=Double.parseDouble(var.getValue().split("_")[1]);
                if(val==a){
                    name=var.getValue().split("_")[0];
                  
                    second.put(var.getKey(),var.getValue().split("_")[0]);
                }
                
            }
            if(second.size()==1){
                System.out.println(name);
            }
            else{
                //System.out.println(second);
                for(Map.Entry<Integer,String> bar:second.entrySet()){
                    names.add(bar.getValue());
                    
                    
                    
                }
                if(names.size()==second.size())
            {
                ArrayList<String> newnames=new ArrayList<>(names);
                Collections.sort(newnames);
                for(String lrr:newnames){
                    System.out.println(lrr);
                }
                
            }
            else{
                   for(Map.Entry<Integer,String> bar:second.entrySet()){
                   System.out.println(bar.getValue());
                    
                    
                    
                }
                
            }
            
            }
            
        }
        
    }
    
}
