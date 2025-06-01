package userdefinedfunction;
import java.util.Scanner;

class InvalidMarksException extends Exception{
    private int marks;
    InvalidMarksException(){        
    }
    InvalidMarksException(int i){
        marks = i;
    }
    @Override
    public String toString(){
        return "InvalidMarksException: " + marks;
    }
}
class MyException{
    void compute(int value)throws InvalidMarksException{
        if (value >100 || value<0){
            throw new InvalidMarksException(value);
        }else{
            System.out.println("Valid Marks: "+value);
        }
    }
}

public class UserDefinedFunction {

    public static void main(String[] args) {
       int i, value;
       Scanner inp = new Scanner(System.in);
       MyException c1 = new MyException();
       for(i=0;i<5;i++)
           try{
               value = inp.nextInt();
               c1.compute(value);
           }catch(InvalidMarksException x){
               System.out.println("Exception Caugh: "+x);
           }
       inp.close();
    }
}