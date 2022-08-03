import java.util.*;

// Write a program to print whether a number is even or odd, also take input from the user.


public class Code1 {

    static String Findoddeven(long value){
        String str;
        str = value%2==0? "Even" : "Odd";

        return str;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long value =sc.nextLong();

        System.out.printf(" The number %d is %s ",value,Findoddeven(value));
        sc.close();
    }
    
}
