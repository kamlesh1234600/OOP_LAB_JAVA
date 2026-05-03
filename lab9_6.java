package LAB9;

// Fibonacci Thread
class FibonacciThread extends Thread {

    public void run() {
        long a = 1, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= 25; i++) {
            System.out.print(a + " ");

            long next = a + b;
            a = b;
            b = next;

            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }

        try {
            System.out.println("\nFibonacci thread sleeping...");
            Thread.sleep(2000);
        } catch (Exception e) {}
    }
}

// Prime Thread
class PrimeThread extends Thread {

    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public void run() {
        int count = 0, num = 2;

        System.out.println("\nPrime Numbers:");
 
        while (count < 15) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

// Main Class
public class lab9_6 {

    public static void main(String[] args) {

        FibonacciThread fib = new FibonacciThread();
        PrimeThread prime = new PrimeThread();

        // Set priority
        fib.setPriority(8);
        prime.setPriority(5);

        fib.start();

        try {
            Thread.sleep(500); // delay before starting prime
        } catch (Exception e) {}

        prime.start();

        try {
            fib.join();
            prime.join();
        } catch (Exception e) {}

        System.out.println("\n\nProgram Finished");
    }
}