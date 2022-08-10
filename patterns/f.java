package patterns;
import java.util.*;
import java.io.*;
/*
    *****
    *****
    *****
    *****
    *****

    logic outer loop 5 times
    inner 5 times every time
 */

import java.io.InputStreamReader;

public class f {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int rows=Integer.parseInt(br.readLine());
        int cols=Integer.parseInt(br.readLine());

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        br.close();
    }
    
}
