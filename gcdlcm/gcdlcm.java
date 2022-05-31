// Take 2 numbers as inputs and find their HCF and LCM.
package gcdlcm;

import java.util.*;


public class gcdlcm {
    static String gcdlcmfunc(long  input1,long input2){
        long a,b;
        if(input1<input2){
            a=input1;
            b = input2;
        }
        else{
             a=input2;
             b = input1;

        }
       
        while(b%a!=0){
            long rem = b%a;
            System.out.printf("%d",rem);
            b=a;
            a=rem;
        




        }
        long gcd = a;
        long lcm = (input1*input2)/gcd;
        return "The Gcd is "+gcd+" and lcm is "+ lcm ;
        
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter 2 numbers that you want to find hcf and lcm ");
        long input1= sc.nextLong();
        long input2=sc.nextLong();
        System.out.printf("%s",gcdlcmfunc(input1,input2));
        sc.close();

    }
    
}
