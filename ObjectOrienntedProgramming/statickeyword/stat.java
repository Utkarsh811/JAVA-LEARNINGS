package ObjectOrienntedProgramming.statickeyword;
import java.util.*;
/*static-> 
 * a simple copy of a variable/methodis created and shared in a class
 * The class owns the static method
 */

public class stat {
    String name;
    int value;
    static int count;
    int cnt;
    public stat(String name){
        this.name=name;
        count++;
    }
    public stat(int value){//constructor overloading
        this.value=value;
        cnt++;
    }

    
}
