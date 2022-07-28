import java.util.*;



public class Substring {
    public static void func(int[] A, int[] B){
      
            int sum=0;
            int mus=0;
            for(int i=0;i<A.length;i++){
                sum=sum+A[i];
            }
            for(int j=0;j<B.length;j++){
                mus=mus+B[j];
            }
            if(sum==mus){
                System.out.println("true");
                // if(A.length<B.length){
                //     return A.length;
                // }
                // else{
                //     return B.length;
                // }

            }
            else{
                System.out.println("false");

            }
     
    }
    public static void main(String[] args){
        int[] A={1,4,5,6,3,2,4};
        int[] B={4,2,4};
        func(A,B);
    }

}
