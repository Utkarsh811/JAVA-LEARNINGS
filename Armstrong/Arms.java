package Armstrong;

import java.util.*;



class Arms
{
    static String arms (long a, long b)
  {
    //findingf armstrong
    int cnt=0;
    String str="";
    long num;
    long temp;
    for (long i = a; i <= b; i++)
      {

	num = i;
	temp = num;



	long rem;
	long sum = 0;
    long cntnum=num;
    int count=0;
    while(cntnum>0){
        cntnum=cntnum/10;
        count=count+1;
    }
    //System.out.println(count);


	while (num > 0)
	  {
	      //System.out.printf("%d",num);
	    rem = num % 10;
	    sum = (sum + (int)Math.pow (rem, count));  //math.pow always return float value
	    num = (num / 10);
	    //System.out.println(num);

	  }
	if (temp == sum)
	  {
	      cnt=cnt+1;
	      if(cnt==1){
	          str=str+temp;
	      }
          else
	      str = str+","+temp;
	       
	   
	  }


      }
      return str;
  }
    
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		
      Scanner sc = new Scanner (System.in);
      long input1 = sc.nextLong ();
      long input2 = sc.nextLong ();
      System.out.printf("%s\n",arms (input1,input2));
      sc.close ();
	}
}