package userdefinedfunction;
import java.util.Scanner;

class InputMismatchException extends Exception{
    private int marks;
    InputMismatchException(){        
    }
    InputMismatchException(int i){
        marks = i;
    }
    @Override
    public String toString(){
        return "InputMismatchException " + marks;
    }
}
class MyExceptions{
    void check(int value)throws InputMismatchException{
        if (value < '0' || value> '9'){
            throw new InputMismatchException(value);
        }else{
            System.out.println("String Detected: "+value);
        }
    }
}

public class MyException {

    public static void main(String[] args) {
       int value1, value2;
       Scanner inp = new Scanner(System.in);
       MyExceptions c1 = new MyExceptions();
           try{
               value1 = inp.nextInt();
               c1.check(value1);
               value2 = inp.nextInt();
               c1.check(value2);
           }catch(InputMismatchException x){
               System.out.println("Exception Caugh: "+x);
           }
       inp.close();
    }
}