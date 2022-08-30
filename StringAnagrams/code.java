//import java.io.*;
import java.util.*;

public class code {
   public static boolean isAnagram(String A, String B) {
   //Complete the function
   Boolean retValue = false;
   if(A != null && B != null) {
       char [] arrayA = A.toLowerCase().toCharArray();
       char [] arrayB = B.toLowerCase().toCharArray();
       Arrays.sort(arrayA);
       Arrays.sort(arrayB);
       retValue = Arrays.equals(arrayA, arrayB);
   }
   return retValue;
}
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
         String str2=sc.nextLine();
         if(isAnagram(str1,str2)){
             System.out.println("Anagrams");
         }
         else{
             System.out.println("Not Anagrams");
             
         }
         sc.close();
         
    }
}
