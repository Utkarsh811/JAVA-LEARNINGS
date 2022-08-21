package ObjectOrienntedProgramming.statickeyword;

public class statmain {
    public static void main(String[] args)
    {
        stat obj1=new stat("utkarsh");
        stat obj2=new stat("utkarsh");
        stat obj3=new stat(3);
        stat obj4=new stat(4);
        System.out.println(stat.count);//static keyword is for a class same copy of count is updating always
        System.out.println(obj3.cnt);
  
    }
    
}
