package ObjectOrienntedProgramming;

import java.util.*;

class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }

}
public class Circle1 {
    public static void main(String args[]){
        
        Circle c1=new Circle();
        c1.radius=45.232;
        System.out.println(c1.area());



    }
    
}
