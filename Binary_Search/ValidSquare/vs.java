//Using binary search we can used to identify a number is perfect square or not
// in naive approach we use Math.sqrt function
// class Solution {
//     public boolean isPerfectSquare(int num) {
//         double a= Math.sqrt(num); ************Math.sqrt always return a double type value
//         System.out.println(a);
//         int b=(int)a;
//         System.out.println(b);
//         if(b*b == num){
//             return true;
//         }
//         else{
//             return false;
//         }
 
        
//     }
// }


package Binary_Search.ValidSquare;
import java.util.*;

//import org.xml.sax.InputSource;

public class vs {
    static boolean isPerfectSquare(int num) {
        long lower=0;
        long higher=50000;
        long mid=0;
        long temp=0;
        while(lower<=higher){
            mid=lower+(higher-lower)/2;
            
             temp=mid*mid;
           
            if(temp==num){
                 System.out.println(mid);
                 System.out.println(temp);
                return true;
            }
            else if(temp<num){
                lower=mid+1;
            }
            else{
                higher=mid-1;
            }
            
            
        }
        return false;
        
    }


    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isPerfectSquare(num));


        sc.close();
        
    }
    
}
