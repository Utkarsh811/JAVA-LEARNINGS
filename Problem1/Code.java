//Replace every array element by multiplication of previous and next

package Problem1;

import java.util.*;
// import java.io.BufferedInputStream;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.io.*;


public class Code {
    public static void changefunc(int[] arr){
        // for(int a:arr){
        //     System.out.println(a);
        // }
        List<Integer>newarr=new ArrayList<Integer>();
       
      newarr.add(arr[0]*arr[1]);
        for(int i=0;i<arr.length-2;i++){
            newarr.add(arr[i]*arr[i+2]);

        }
        newarr.add(arr[arr.length-2]*arr[arr.length-1]);
        System.out.println(newarr);
       

    }
    public static void main(String[] args) throws Exception
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(br.readLine());
        int[] arr={2, 3,7};
        changefunc(arr);



        br.close();

    }


    
}
