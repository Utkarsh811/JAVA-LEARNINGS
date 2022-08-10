package Sorting;

import java.util.Arrays;

public class merge2arrays {
    public static int[] mergingarr(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int n=arr1.length;
        int m=arr2.length;
        int[] arr3=new int[n+m];
        while(i<n &&j<m){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;

            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }

        }
        while(i<n){
            arr3[k++]=arr1[i++];
        }
        while(j<m){
            arr3[k++]=arr2[j++];
        }
        return arr3;

    }
    public static void main(String[] args){
        int[] arr1=new int[]{9,90,100};
        int[] arr2=new int[]{3,5,6,7,8};
        String nrr=Arrays.toString(mergingarr(arr1,arr2));
        System.out.println(nrr);

       

    }
    
}
