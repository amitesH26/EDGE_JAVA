package exercise6;

class Constructor {
    private int i;
    private int[] arr;

    Constructor() {
        arr = new int[0];
        i = 0;
    }

    Constructor(int... n) {
        arr = new int[n.length];
        i = n.length;
        for (int j = 0; j < n.length; j++) {
            arr[j] = n[j];
        }
    }
    
    Constructor(Constructor ... n){
        arr = new int[n.length];
        i =n.length;
        
        for(int k = 0; k < n.length; k++){
            
        }
    }

    void print() {
        if (i == 0) {
            System.out.println("No values to display.");
        } else {
            for (int j = 0; j < i; j++) {
                System.out.println("Value " + (j + 1) + ": " + arr[j]);
            }
        }
    }
}

public class Exercise6 {
    public static void main(String[] args) {

        Constructor cons = new Constructor();
        cons.print();

        Constructor cons1 = new Constructor(3, 4);
        cons1.print();
        
        Constructor cons2 = new Constructor(3,5,6,7,2,3);
        cons2.print();
        
        Constructor cons3 = new Constructor(cons2);
        cons3.print();
    }
}
