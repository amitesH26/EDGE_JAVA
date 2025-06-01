
package Test;
import Calculation.*;


public class Packages {
    public static void main(String[] Args){
    
        Sum t1 = new Sum(2,4);
        System.out.println(t1.Addition(6,3));
        
        Sub t2 = new Sub();
        System.out.println(t2.Subtraction(6,3));
        
        Mux t3 = new Mux();
        System.out.println(t3.Multiplication(6,3));
        
        Div t4 = new Div();
        System.out.println(t4.Division(6,3));
    }
}
