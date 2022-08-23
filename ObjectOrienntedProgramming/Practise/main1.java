package ObjectOrienntedProgramming.Practise;

public class main1 {
    public static void main(String[] args)
    {
        //creating object of cuboid
        parent11 obj1=new parent11(21,43,65);
        parent11 obj2=new parent11();//object declaration
        parent11 obj3=new parent11();
        //System.out.println(obj1.length);//cannot access because length is private data member and cannot be accessed from other class.
        System.out.println(obj1.getter());
        System.out.println(obj1.counter);
        Child2 objc2=new Child2();
        objc2.override_method();
        Child1 objc1=new Child1();
        objc1.override_method();



    }
    
}

/*
 * Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).
 */
