package ObjectOrienntedProgramming;


public class Code1_1 {
   
 public static class Example{ 
        // this is the blue print , it does not occupy any sort of memory during run time
        String name="Utkarsh";
        int age=21;
        int ag1=32;
        int ag2=43;
        static int count=0;
        
    
        public  Example(){ //default constructor
           
            
            count++;
            //System.out.println(count);
        }

        public Example(String name, int age){
            //this();
            this.name=name;
            this.age=age;
            String newstr=String.format("the %s new age after  using parametrised constructor is %d",this.name,this.age);
            System.out.println(newstr);
        }
        //methods in class also an example of polymorphism
        public static void func1(int val1,int val2){
            int val3=val1+val2;
            String str=String.format("the net age is %d", val3);
          System.out.println(str);
        }

        public static void func1(){
            System.out.println("hello");
        }
    }
  
    public static void main(String[] args){
        Example obj1=new Example(); // Example() is the default constructor given by java to constuct new objects.it return object
        Example obj2=new Example();
     Example obj3=new Example();
    

        System.out.println(obj1.name); //when objects are created ,at that time at run time memory allocation iis done
        System.out.println(obj1.age);
       obj1.func1(obj1.ag1,obj1.ag2);
       obj1.func1();
       
       Example obj4=new Example("Vaibhav",76);//parameterized constructor
       System.out.println("total no of times constructor called-:"+Example.count); //constructor method



    }
    
}
//every class has 2 thing properties and behaviour
//2 types of polymorphism -> compile time polymorphism(above example) and run-time polymorphism
//constructors(special methods) help us to create ne objects
//static means property of a class
//static int a means variable a is property of a class
//we use static keyword for those properties, method which are not depend on object and remain constant throughout the class
//Rules for creating Java constructor
/*There are two rules defined for the constructor.

Constructor name must be the same as its class name
A Constructor must have no explicit return type
A Java constructor cannot be abstract, static, final, and synchronized*/
//this() keyword in java is used in 2 ways
