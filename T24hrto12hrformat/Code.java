package T24hrto12hrformat;
import java.util.*;

public class Code {
    public static void Changedate(String date){
        String newdate="";
        String dat;
        String[] arr=date.split(":");
        // for(String s:arr){
        //     System.out.println(s);

        // }
        for(int i=0;i<arr[2].length();i++){
            if(arr[2].charAt(i)=='A')
            {
                if(arr[0]=="12"){
                    newdate="0"+":"+arr[1]+":"+arr[2];
                }
                else{
                    newdate=date;
                }

            }
            if(arr[2].charAt(i)=='P'){
                if(arr[0]=="12"){
                    newdate=date;
                }

                else{
                    dat=String.valueOf(Integer.parseInt(arr[0])+12);
                    newdate=dat+":"+arr[1]+":"+arr[2];

                    

                }

            }
        }
        System.out.println("The 24 hour Format time is-:"+newdate);


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String date=sc.nextLine();
        System.out.println("The 12Hour format is-:"+ date);
        
        Changedate(date);
        sc.close();

    }
    
}
