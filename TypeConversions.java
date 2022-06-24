import java.lang.ProcessBuilder.Redirect.Type;
import java.util.*;
public class TypeConversions{
    public static int func(int nums){

        String a =String.valueOf(nums);  //integer to string
        char we='r';
        String b = String.valueOf(we);
        System.out.println(a);
        System.out.println(b); //Character to string

        System.out.println(a.getClass());
        System.out.println(b.getClass().getSimpleName()); //to obtain the type of  variable
        Integer aer=535;
        System.out.println(aer.getClass().getSimpleName());
        //string to integer
        // String str="yash goel";
        // int var2=Integer.parseInt(str);  
        // System.out.println(var2);
        char s='A';
        int var3=s;
        System.out.println(var3);
        System.out.println(String.valueOf(s));
        double var5=42.35f;
        System.out.println(String.valueOf(var5));
        //System.out.println(var5.getClass().getSimpleName());

        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        func(nums);
        sc.close();

    }

}