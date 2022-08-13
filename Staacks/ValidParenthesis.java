package Staacks;

import java.util.*;

public class ValidParenthesis {
    public static boolean checkvalidity(Stack<Character> stak,char value)
    {
        if(stak.isEmpty()){
            return false;//means closing bracket more and stack is empty
        }
        else if(stak.peek()!=value)
        {
            return false;//bracket mismatching from top
        }
        else{
            stak.pop();
            return true;
        }


    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Stack<Character> stak = new Stack<>();
    /*pushing all opening  Brackets (,[,{*/
        for(int i=0;i<str.length();i++)
        {
            char val=str.charAt(i);
            if(val=='(' || val=='{' || val== '[')
            {
                stak.push(val);
            }
            else{
                if(val==')')
                {
                    boolean res=checkvalidity(stak,'(');
                    if(res==false){
                        System.out.println("false");
                        return;
                    }


                }
                else if(val=='}')
                {
                    boolean rees=checkvalidity(stak,'{');
                    if(rees==false){
                        System.out.println("false");
                        return;
                    }

                }
                else if(val==']')
                {
                    boolean reees=checkvalidity(stak,'[');
                    if(reees==false){
                        System.out.println("false");
                        return;
                    }

                }
                else{
                    continue;
                }
            }
        }
        if(stak.isEmpty()){
            System.out.println("True");

        }
        else{
            System.out.println("false");
        }
    
    sc.close();
  }
}
