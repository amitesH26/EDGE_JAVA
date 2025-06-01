import java.util.*;
class calculation {
    
/*  Method overloading  
    double sum(double a){
        return a+a;
}
    double sum(double a,double b){
        return a+b;
    }
    double sum(double a,double b,double c){
        return a + b + c;
    } 
    problem 1 demo
    int calculate(int arr[], int n){
        int sum=0;
        for(int i = 0; i<n; i++)
            sum = sum = arr[i];
        return sum;
    }
}
class INITIALIZE{
    
    int a;
    String b;
    
    INITIALIZE(int a){
        this.a = a;
}
    INITIALIZE(String b){
        this.b = b;
    }
    int calculator(int ... n){
        int sum = 0;
        
        for(int i:n){
            sum+=i;
        }
        return sum;
    }
    variable lenght argument
    void DisplayFlower(String ...n){
        for(String i:n){
            System.out.println(i);
        }
    }*/
    double Summation(double ...n){
        int sum=0;
        for(double i:n)
            sum += i;
        return Math.abs(sum);
    }
    double Substraction(double ...n){
        double sub = 0;
        for(double i:n)
            sub -= i;
        return Math.abs(sub);
    }
    double Multiplication( double ...n){
        int mux=1;
        for(double i:n)
            mux *= i;
        return Math.abs(mux);
    }
/*    double Devide( double ...n){
        int div = 1;
        
        return Math.abs(div);
    }*/
    void Display(String ...n){
        for(String i:n)
        System.out.println("\t"+i);
        System.out.println("\n");
    }
}


public class MATH{
    
    public static void main(String[] Args){
        
        calculation calc = new calculation();
//      Scanner scan = new Scanner(System.in);
        
//      System.out.println(calc.sum(3));
//      System.out.println(calc.sum(3,5));
//      System.out.println(calc.sum(3,2,5));
        
          
//      System.out.println(calc.calculator(2,3,4,5,2,3,6));
//      calc.DisplayFlower("Joba","Jui","Golap");
    }
}
