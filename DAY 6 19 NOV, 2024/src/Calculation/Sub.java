
package Calculation;


public class Sub {
    public int Subtraction(int ... n){
        int sub = n[0];
        for(int i= 1; i<n.length;i++)
            sub -= n[i];
        return sub;
    }
}
