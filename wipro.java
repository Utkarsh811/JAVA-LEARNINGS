import java.util.*;
import java.util.Map.Entry;

public class wipro {

  public static char[] func(int[] input1) {
    String rr = "abcdefghijklmnopqrstuvwyz";
    int[] input = input1.clone();

    Arrays.sort(input1);

    HashMap<Integer, Character> map = new HashMap<Integer, Character>();
    for (int i = 0; i < input1.length; i++) {
      map.put(input1[i], rr.charAt(i));
    }

    Character ch;
    String s = "";

    for (int i = 0; i < input.length; i++) {
      for (Entry<Integer, Character> entry : map.entrySet()) {
        if (entry.getKey() == input[i]) {
          ch = entry.getValue();

          s = s + ch;
        }
      }
    }
    System.out.println(s);
    char[] chrr = s.toCharArray();

    return chrr;
  }

  public static void main(String args[]) {
    int[] input1 = new int[] {10,5,70,1};

    System.out.println(func(input1));
  }
}
