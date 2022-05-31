package Palindrome;

import java.util.*;

public class Palind{

    static String palini(String str){
        String word1="Palindrom";
        String word2= "Not Palindrom";
        int i,j;
        int flag=0;
        i=0;
        j=str.length()-1;
        if(str.length()==1){
            return word1;
        }
    
       
        while(i<j || i!=j){
            if(i>j || i==j)break;
            
           
            if(str.charAt(i)==str.charAt(j)){
               // System.out.printf("%s,%s\n",str.charAt(i),str.charAt(j));
                i++;
                j--;
                flag=1;


            }
           
            else{
                flag=2;
                break;
            }

           
        }
        //System.out.println(flag);
      
        if(flag==1){
            //System.out.println("palin");
            return word1;
        }
        else{
            //System.out.println("not");
            return word2;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.printf("%s",palini(str));
        sc.close();

    }





}