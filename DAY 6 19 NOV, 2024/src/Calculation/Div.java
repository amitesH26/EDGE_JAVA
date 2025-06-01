
package Calculation;


public class Div {
    public double Division(double ... n){
        double div = n[0];
        for( int i = 1; i<n.length; i++)
            div /= n[i];
        return div;
    }
}
