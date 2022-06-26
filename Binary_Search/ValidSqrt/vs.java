//we can calculate the squareroot by Math.sqrt method as well as binary search method

package Binary_Search.ValidSqrt;

import java.util.Scanner;

public class vs {
    public static int mySqrt(int x){
        long low=0;
        long high=x;
        long mid=0;
        while(low<=high)
        {                  //0<16,9<16,6<16
            System.out.println("low="+low+"high="+high);
            mid=low+(high-low)/2;//8
                System.out.println("mid="+mid);
            if(mid*mid==x){//64==16  5
                return (int)mid;
            }
            else if(mid*mid<x){
                low=mid+1;
            }
            else{//low=9  low=6
                high=mid-1;
            }
            
            
        }
        if(mid*mid<x){
            return (int)mid;
        }
        if((mid*mid>x) &&((mid-1)*(mid-1)<x)){
            return (int)(mid-1);
        }
        return 0;

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(mySqrt(x));
        sc.close();

    }
    
}
