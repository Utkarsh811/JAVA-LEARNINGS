package StringsQuestions;

import java.util.*;

public class leet451 {

  public static void countfreq(String str) {
    System.out.println(str);
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
        if(map.containsKey(str.charAt(i))){
            int value=map.get(str.charAt(i));
            map.put(str.charAt(i),value+1);

        }
        else{
            map.put(str.charAt(i),1);
        }

    }
    int[] arr=new int[map.size()];

    int index=1;

    for(Map.Entry<Character,Integer> ref:map.entrySet()){
        //System.out.println(ref.getValue());
        if(arr[0]==0){
            arr[0]=ref.getValue();
        }
        else{
    
            

            //Apply Insertion Sorting
    
           
          
                arr[index]=ref.getValue();
            
                for(int j=index-1;j>=0;j--){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                      
                    }
                    else {break;}
                }
                index++;
              
         
            
        }
        

    }
    for(int a:arr){
        System.out.println(a);
    }

    System.out.println(map);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    countfreq(str);
  }
}
