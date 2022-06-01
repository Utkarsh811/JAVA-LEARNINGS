package Weirdalgo;

import java.util.Scanner;



public class Wierd {

    static String algostart(long number){
        //n is changing till it becomes finally 1
        //when it become  1 just go out from the loop.
        long temp=number;
        String str="";
        while(number!=1){
            if(number%2==0){
                number=number/2;
                str=str+number+"=>";
                //System.out.println(str);
            }
            else{
                number=number*3+1;
                str=str+number+"=>";
                //System.out.println(str);
            }

        }
        return str;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long number =sc.nextLong();
        System.out.printf("%s",algostart(number));

        sc.close();
    }
    
}
