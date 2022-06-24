import java.util.Scanner;

public class Pincalc {
    static int func(int input1,int input2,int input3,int input4){
        int[] arr=new int[3];
        arr[0]=input1;
        arr[1]=input2;
        arr[2]=input3;
        int result=0;
        String n;
      
      
        int sume=0,sumo=0;
        for(int i=0;i<arr.length;i++){
            n=Integer.toString(arr[i]);
         
            for(int j=0;j<n.length();j++){
                if(j%2==0){
                    sume=sume+Integer.parseInt(String.valueOf(n.charAt(j)));
                }
                else{
                    sumo=sumo+Integer.parseInt(String.valueOf(n.charAt(j)));
                }

            }
           
            if(input4%2==0){
                result=sume-sumo;
            }
            else{
                result=sumo-sume;
            }
          

           
            
           
        }
        return result;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int input4=sc.nextInt();
        System.out.println(func(input1,input2,input3,input4));
        sc.close();
    }
    
}
