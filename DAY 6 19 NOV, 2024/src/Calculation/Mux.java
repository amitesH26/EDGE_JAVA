
package Calculation;


public class Mux {
    public int Multiplication(int ... n){
        int mux = n[0];
        for(int i= 1; i < n.length; i++)
            mux *= n[i];
        return mux;
    }
    
}
