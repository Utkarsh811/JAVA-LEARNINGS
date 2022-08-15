
// Input a year and find whether it is a leap year or not.\
// if( (year%100 == 0 && year%400 == 0) ||  
// (year%100 != 0 && year%4   == 0)   ) 

import java.util.*;



public class Leap 
{

    static String Findyear(int year)
{
    // if( (year%100 == 0 && year%400 == 0) ||  (year%100 != 0 && year%4   == 0)   ) {
    //     return "leap year";
    // }
    // else{
    //     return "not a year";
    // }
    String result;

    result = ( (year%100 == 0 && year%400 == 0) ||  (year%100 != 0 && year%4   == 0)   ) ? "Leap Year" : "Not a Leap Year";
    return result;


}
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    

    System.out.println(Findyear(year));
    sc.close();
    }

}
