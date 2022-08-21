package ObjectOrienntedProgramming.METHOD_OVERRIDING;

public class shmain {

    public static void main(String[] args) {
        square s1=new square(4);
        System.out.println(s1.sides);
        System.out.println(s1.perimeter());//first goes to its closest route and check does this method exist?
         s1.ident(); //then check its parent class

        
    }

    
}
