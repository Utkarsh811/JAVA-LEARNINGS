// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.*;
public class Sumall {


    static long summy(long value,long sum){
        System.out.printf("the sum of %d + %d-:",sum,value);
        
        sum=sum+value;
        System.out.printf("%d",sum);

        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        long value = sc.nextLong();
        long breakvalue = sc.nextLong();
        long sum=0;
        while(breakvalue!=value){
            
            sum = summy(value,sum);
            value = sc.nextLong();




        }
        System.out.printf("Th sum is-:%d",sum);
        sc.close();
    }
    
    
}
