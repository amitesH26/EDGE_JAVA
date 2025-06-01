
package exercise6;
import UserDefinedFunction.GPACalculation;
import java.util.Scanner;

class MyException extends Exception{
    MyException(String x){
        super(x);
    }
}
class Validate{
    void isValid(int credit, int number)throws MyException{
        if(number < 0 || number > 100)
            throw MyException("df");
    }
}


public class Exercise3 {
    
}
