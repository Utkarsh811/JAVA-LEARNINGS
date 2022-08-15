package BasicCodes;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        HashMap<Integer,String> map=new HashMap<>();
        while(T>0)
        {
            String str=br.readLine();
            int id=Integer.parseInt(str.split(" ")[0]);
            String str1=str.split(" ")[1]+str.split(" ")[2];
             map.put(id,str1);
             
       
  
             
            
            T--;
        }
        System.out.println(map);
        br.close();
    }
}

