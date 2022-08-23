package ObjectOrienntedProgramming.Practise;

public class Child2 extends parent11{

    int n;
   


    @Override
    public void override_method()
    {

        System.out.println("this is child2class");
    }


    public static void main(String[] args)
    {
        Child2 objc=new Child2();
        System.out.println(objc.getter());
    }

    
}
