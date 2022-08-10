package patterns;
/*
    *                           
    **
    ***
    ****
    *****
    rows are 5
    cols are increasing from 1 to 5
    0 
    1 2 
    3 4 5 
    6 7 8 9 
    10 11 12 13 14 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int rows=Integer.parseInt(br.readLine());
        int cols=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<rows;i++){
        
            for(int j=0;j<=i;j++)
            {


                System.out.print(count++ +" ");
            }
            System.out.println();

            
        }
        
            /*orrrrrr you can write like this,try this by understanding this you can solve more pattern question */
        for(int m=0;m<rows;m++){
            for(int n=0;n<cols;n++){
                if(n<=m){
                    System.out.print("e");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    
}


