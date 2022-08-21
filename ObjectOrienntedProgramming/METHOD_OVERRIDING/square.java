package ObjectOrienntedProgramming.METHOD_OVERRIDING;

public class square extends shapes {
 public square(int sides){
     this.sides=sides;

 }

 @Override
 public String perimeter(){
     return "the perimeter of square is side ka square";
 }

    
}
