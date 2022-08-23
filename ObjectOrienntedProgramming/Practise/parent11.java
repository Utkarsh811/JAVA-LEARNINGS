package ObjectOrienntedProgramming.Practise;

public class parent11 {

    private int length;
    private int width;
    private int height; 
    static int counter=0;//to count how many times the class has been called for object creation
    //static is used for memory saving. it refreshes memory for entire a class time

    //calling constructor
    public parent11(int len,int wid,int hei)
    {
    
        setter(len,wid,hei);
        counter++;
        

    }
    //overloading constructor
    public parent11()
    {
        counter++;
    }
    //getters method to retrieve data
    public String getter(){
        String str=String.format("the length is %d and width is %d and height is %d", this.length,this.width,this.height);
        return str;


    }
    //setter method to set the data
    public void setter(int len,int wid,int hei)
    {
        this.length=len;
        this.height=hei;
        this.width=wid;
    }

    //the method which i am going to call on child classes too
    public void override_method()
    {

        System.out.println("this is superclass");
    }
    
}
