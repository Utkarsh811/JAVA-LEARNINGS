import java.util.Scanner;

// Take a number as input and print the multiplication table for it.

public class Multiplicationtable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int tablenum = sc.nextInt();


        for (int i=0;i<11;i++){
            int output;
            output=tablenum*i;

        
        System.out.printf("%d * %d = %d\n", tablenum ,i,output);
        }
        sc.close();
    }
    
}
