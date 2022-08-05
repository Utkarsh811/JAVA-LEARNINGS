package importantpoints;
import java.util.*;
import java.io.*;

public class standaradcode {
    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<String,Integer> map=new HashMap<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while(n>0){
            String key=br.readLine();
            int value=Integer.parseInt(br.readLine());
            map.put(key,value);
            n--;
        }
        String s;
        while((s=br.readLine())!=null){
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        br.close();
    }
    
}
