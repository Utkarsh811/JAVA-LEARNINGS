/*package whatever //do not write package name here */
package importantpoints;

import java.util.*;

class hashmap{
      public static void funcput(HashMap<String,Integer> map,String val,int lav){
          
          //that how you enter element in an HashMap
        map.put(val,lav);
    }
    
	public static void main (String[] args) {
		   HashMap<String,Integer> map=new HashMap<>();
		    funcput(map,"India",2345);
		    funcput(map,"australia",424);
		    funcput(map,"africa",2422);
		    funcput(map,"northvirginia",533);
		    funcput(map,"India",9999);//put works as update when key already exists
		    System.out.println(map);
		    //to lookout whether key exists or not
		    System.out.println(map.containsKey("India"));
		    //to get key value
		    System.out.println(map.get("australia"));//returns value
		     System.out.println(map.get("sdsds"));//if key not exists returns null
		     //Iterating over HashMap************Best method to iterate an array
		     for(Map.Entry<String,Integer> variable:map.entrySet()){
		         System.out.println(variable);//contains key value pair
		         System.out.println(variable.getKey());
		          System.out.println(variable.getValue());
		         
		     }
             //another method to iterate 
             //creating keyset and finding corresponding values
             Set<String> key=map.keySet();
             System.out.println(key);
		     for(String akey:key){
                 System.out.println(akey+" = "+map.get(akey));
             }

             //Now how to remove a pair from hashmap

             map.remove("australia"); //by putting key it remove the whole pair
             System.out.println(map);
		     
		    
		    
		   
	}
}