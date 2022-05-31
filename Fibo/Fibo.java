// To calculate Fibonacci Series up to n numbers.
//  The Fibonacci sequence is a type series where each number is the sum of the two that precede it. It starts 
// from 0 and 1 usually. The Fibonacci sequence is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on.
//  The numbers in the Fibonacci sequence are also called Fibonacci numbers. In Maths, the sequence is defined as an 
//  ordered list of numbers that follow a specific pattern. The numbers present in the sequence are called the terms. 
//  The different types of sequences are arithmetic sequence, geometric sequence, harmonic sequence and Fibonacci 
//  sequence. 

package Fibo;
import java.util.*;

public class Fibo {
    static String Fibou(int Fibon2,int Fibon1,int count){
        String series =",";

        if(count<=0){
            
            return series;
            
        }
        // System.out.printf("%d",count);
        System.out.printf("\n%s",series);
        System.out.printf(",%d,%d,",Fibon2,Fibon1);

     
        series = series+String.valueOf(Fibon2)+","+String.valueOf(Fibon1);
        return Fibou((Fibon2+Fibon1),(Fibon2+Fibon1+Fibon1),count=count-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // int Fibon2=0;
        // int Fibon1=1;
        System.out.printf("%s",Fibou(0,1,count-2));
        sc.close();


    }
    
}
