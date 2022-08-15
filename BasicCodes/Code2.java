// Take name as input and print a greeting message for that particular name.
import java.util.*;

public class Code2 {

  static String Greetfunc(String Name) {
    String newstr = "Hello " + Name + " How are you  " + Name + "?";
    return newstr;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String Name = sc.next();
    System.out.printf("%s", Greetfunc(Name));

    sc.close();
  }
}
