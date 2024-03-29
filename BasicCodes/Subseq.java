


//import java.io.*;
import java.util.*;
public class Subseq {
    public static void printSubsequence(int[] arr, int indx, ArrayList<Integer> ds){
        // base case
        if(indx==arr.length){
            if(ds.size()>0){
                System.out.println(ds);
            }
            return ;
        }
        ds.add(arr[indx]);// add to array list
        printSubsequence(arr, indx+1, ds);  // pick an element
        ds.remove(ds.size()-1);// remove from array list
        printSubsequence(arr, indx+1, ds);// not pick

    }
    public static void main(String[] args) {
    int[] arr= {1,2,3};
    ArrayList<Integer> ds= new ArrayList<>();
    printSubsequence(arr, 0, ds);

    }}