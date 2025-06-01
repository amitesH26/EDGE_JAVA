
package exercise6;

class Prime{
    
    void displayPrimesAndSum() {
        
        int count = 0;
        int sum = 0;
        
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + "  ");
                sum += i;
                count++;
                if (count % 3 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nSum of prime numbers: " + sum);
    }

    static boolean isPrime(int n) {
        // Special cases
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Exercise4 {

    public static void main(String[] args) {
        
        Prime p1 = new Prime();
        p1.displayPrimesAndSum();
        
    }
}

