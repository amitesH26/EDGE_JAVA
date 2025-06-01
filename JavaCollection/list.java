import java.util.*;  
public class list {  
    public static void main(String args[])  
    {  
  
        // here create a List  
        List<String> al = new ArrayList<>();  
  
        // Now add the elements in the List  
        al.add("BMW");  
        al.add("Hundai");  
        al.add("Toyota");  
        al.add("Swift");  
  
        // Iterating the List  
        // element using for-each loop  
        for (String cars : al)  
            System.out.println(cars);  
    }  
}  