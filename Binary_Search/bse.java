package Binary_Search;

import java.util.*;

public class bse {

  static String bse(ArrayList<Integer> mylist, int target,int size) {
    System.out.println(mylist);
    System.out.println(mylist.size());

    String str="";
    int mid;
    int left = mylist.size()-1;
    int right = 0;
    while (right<=left) 
    {
      mid = (left + right) / 2;
      if (mylist.get(mid) == target) {
          System.out.println(mid);
        str = "Target found in array";

        return str;
      } 
      else if (mylist.get(mid) > target) {
        left = mid - 1;
      } 
      else {
        right = mid + 1;
      }
    }

    if (right > left) {
      str = "Target not found";
      return str;
    }
    return str;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array-:");
    int size = sc.nextInt();

    ArrayList<Integer> mylist = new ArrayList<Integer>();
    for (int i = 0; i < size; i++) {
      int elem = sc.nextInt();
      mylist.add(elem);
    }
    System.out.println("Enter the target element-:");
    int target = sc.nextInt();
    System.out.printf("%s", bse(mylist, target,size));
    sc.close();
  }
}
