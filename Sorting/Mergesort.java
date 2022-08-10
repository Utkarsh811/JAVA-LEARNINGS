package Sorting;
//Merge Sort
/*Based on Divide conquer technique 
 * 1.the first step is DIVIDING
 * 2nd the step is conquering
 * time complexity is O(nlogn)
*/
public class Mergesort {
    public static void conquer(int[] arr,int low,int mid,int high){
        int[] mergearr=new int[high-low+1];
        int index1=low;
        int index2=mid+1;
        int x=0;
        while(index1<=mid&& index2<=high){
            if(arr[index1]<=arr[index2]){
                mergearr[x++]=arr[index1++];

            }
            else{
                mergearr[x++]=arr[index2++];
            }
        }
        while(index1<=mid){
            mergearr[x++]=arr[index1++];
        }
        while(index2<=high){
            mergearr[x++]=arr[index2++];

        }
        for(int i=0,j=low;i<mergearr.length;i++,j++){
            arr[j]=mergearr[i];
        }
    }
    public static void divide(int low,int high,int[] arr){
        int mid=-1;
      
        if(low>=high){
            //System.out.println(arr[mid]);
            return;
        }
            mid=low+(high-low)/2;
        
            divide(low,mid,arr);
            divide(mid+1,high,arr);
            conquer(arr,low,mid,high);
     
    }
    public static void main(String[] args){
        int[] arr=new int[]{4,23,4,124,52,313,53,1,52,54,3,23,532};
        int size=arr.length;
        divide(0,size-1,arr);

        for(int a:arr){
            System.out.println(a);

        }

    }
    
}
