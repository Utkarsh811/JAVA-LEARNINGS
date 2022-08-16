package ObjectOrienntedProgramming.Constructors;


    public class Rectangle{
        private int length;
        private int breadth;

        /*calling constructor */
        public Rectangle(int length,int breadth){
            SetterLB(length,breadth);
            

        }

        /*Encapsulation example Setter method */
        public void SetterLB(int lval,int bval)
        {
            this.length=lval;
            this.breadth=bval;
        }
        public String GetterLB()
        {
            String str=String.format("the length and breadth is %d,%d ",this.length,this.breadth);
            return str;
            
            
        }


    }
    

