/*Inheritance ia  a very important topic in java to solve real world problems
 * Using inheritance an explicit class can inherit properties of of its parent class
 * super keyword -> it is used to call the parent class constructor 
 */
package ObjectOrienntedProgramming;

import ObjectOrienntedProgramming.Code1_1.Example;

public class code1_2 {
  
    public static class GrandFather{
        static String name;
        static int age;
        static String work;
        static int count;/*this count is declared to count the no of constructors called throughout the program
        so its necessary to use static*/
        

        //constructor calling to construct a new object in main method
        public GrandFather(){
            count++;
           // System.out.println(count+"time constructor called");
            System.out.println("hello I am a default constructor");
        }
        //parameterized constructor to construct and allocate memory during creation of new objects
        public GrandFather(String name,int age ,String work){
            this(); //it calles an dcounts the defaullt constructor
            this.name=name;
            this.age=age;
            this.work=work;
            String str=String.format("%s age is %d and he is a %s", this.name,this.age,this.work);
            System.out.println(str);

        }
        //methods of the class

        public static void func1(String work){
            System.out.println("func1 called"+work);

        }
        public static void func2(){

        }
        public static void func3(){

        }
        public static void specialfunc(){
            System.out.println("function made in parent class ==>example of run time polymorphism");
        }

        


    }
    public static class Daddy extends GrandFather
      /*Inheritances uses extends keyword to aquire all 
    all properties of its parent */
    {
    public  Daddy(String name,int age,String work)
    {
        super(name,age,work);//super keyword is used to call its parent constructor

    }
    public static void specialfunc(){
        System.out.println("now same special function called in child class");
    }
}


    public static void main(String[] args){
        GrandFather obj1=new GrandFather();//default constructor calling
        GrandFather obj2=new GrandFather("babaji",90,"politician");
        GrandFather obj3=new GrandFather();
        GrandFather obj4=new GrandFather();
        System.out.println(obj2.name);
        obj2.func1(obj2.work);
      
        Daddy dad_obj1=new Daddy("pappaji",48,"vidhayak");
      dad_obj1.func1(dad_obj1.work);
      System.out.println(GrandFather.count);
      dad_obj1.specialfunc();
      obj2.specialfunc();
      Example exe=new Example();//eg of Encapsulation as we made func1 in Code1_1 file andwe are using its methods here by making its objects
      exe.func1();



    }

       
        
    
    
}


//Encapsulation
/*Hiding properties and methods to ensure security
 * we use packages and access modifiers
 * public,private,protected
 * .In Encapsulation , we are hiding data because of securities reason
 * 
 */
//Abstraction
/*In Abstract ,we are hiding complex data to provide easiness and less complex
 * To achieve abstraction in java ,we have 2 keywords
 * 1.Abstract
 * 2nd. Interfaces
*/
