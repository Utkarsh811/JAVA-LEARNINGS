package BasicCodes;
import java.util.*;
public class sol{
    public static String reversestring(String str)
    {
        String output="";
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            stk.push(str.charAt(i));
        }
        while(!stk.isEmpty())
        {
            //System.out.println(stk.pop());
            output=output+stk.pop();


        }
        System.out.println(output);
        return output;
    }
    public static void main(String[] args)
    {
        String str="Programmer";
        reversestring(str);
    }
}