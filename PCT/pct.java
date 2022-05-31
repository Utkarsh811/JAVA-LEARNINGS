package PCT;

import java.util.Scanner;

public class pct {
    static String srt(Double simple,Double rate,Double  time){
        Double result = (simple*rate*time)/100;
        return "the SI is "+result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double simple = sc.nextDouble();
        Double rate = sc.nextDouble();
        Double time = sc.nextDouble();

        System.out.printf("%s",srt(simple,rate,time));
        sc.close();
        
    }
    
}
