// Take two numbers and print the sum of both.

import java.util.*;



public class sum1 {

    static long sum(long input1,long input2){
        long sum;
        sum=input1+input2;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long input1=sc.nextInt();
        long input2=sc.nextInt();
        System.out.printf(" The input1 is %d\n",input1);
        System.out.printf(" The input2 is %d\n",input2);
        System.out.printf("the result is-:  %d",sum(input1,input2));


        sc.close();


    }
    
}
