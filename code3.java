import java.util.*;


public class code3 {
    public static int func(int a,int b){
        int ans=0;
        String s = Integer.toBinaryString(a);
        String u = Integer.toBinaryString(b);
        System.out.println(s);
        System.out.println(u);
        


        return ans;
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(func(a,b));

        
        sc.close();
    }

    
}
