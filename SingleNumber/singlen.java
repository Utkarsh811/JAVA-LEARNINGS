// this will not work for negative numbers 
package SingleNumber;

import java.util.*;

public class singlen {

    static int Findingmaximum(int[] nums) {

        int max = nums[0];
        int i = 1;
        while (i < nums.length) {
            if (nums[i] > max) {
                max = nums[i];

            }
            i++;
        }
        System.out.println(max);
        return max;
    }

    static void singly(int[] nums) {

        int maxelem = Findingmaximum(nums);
        System.out.println(nums[3]);
        ArrayList<Integer> arr = new ArrayList<Integer>(Collections.nCopies(maxelem + 1, 0));
        System.out.println(arr);
        for (int i = 0; i < nums.length; i++) {
            if (arr.get(nums[i]) == 0) {
                arr.set(nums[i], 1);
            } else {
                int val = arr.get(nums[i]);
                val++;
                arr.set(nums[i], val);
            }

        }
        String str = "";
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                str = str + i + ",";
            }
        }
        System.out.println(str);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("enter input1 " + i + "-:");
            int elem = sc.nextInt();
            nums[i] = elem;

        }
        singly(nums);

        sc.close();
    }

}
