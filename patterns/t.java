package patterns;
import java.io.*;
/*
         *
        **
       ***
      ****
     *****

     **** 
     ***  
     **   
     *    
 */

public class t {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int rows=Integer.parseInt(br.readLine());
        int cols=Integer.parseInt(br.readLine());
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(j<=(cols-2)-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    
}
