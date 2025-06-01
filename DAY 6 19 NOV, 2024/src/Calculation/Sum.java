
package Calculation;


public class Sum {
    public int a,b;
    public Sum(int a, int b){
        
        this.a = a;
        this.b = b;
        System.out.println("Mux: "+ (a+b));
    
}
    
    public int Addition(int ... n){
        int sum = 0;
        for(int i = 0; i < n.length; i++)
            sum += n[i];
        return sum;
    }
}
