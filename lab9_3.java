
import java.util.Scanner;
/*3)Program calculate the sin(x) and cos(x) functions by computing the sin series and cos series functions using
thread techniques.(sin(x) and cos(x) calculate using Math class). */
// Thread for sin(x)
class SinThread extends Thread {
    double x;

    SinThread(double x) {
        this.x = x;
    }

    public void run() {
        double result = Math.sin(x);
        System.out.println("sin(" + x + ") = " + result);
    }
}

// Thread for cos(x)
class CosThread extends Thread {
    double x;
    CosThread(double x) {
        this.x = x;
    }
    public void run() {
        double result = Math.cos(x);
        System.out.println("cos(" + x + ") = " + result);
    }
}

// Main class
public class lab9_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x (in radians): ");
        double x = sc.nextDouble();

        // Create threads
        SinThread t1 = new SinThread(x);
        CosThread t2 = new CosThread(x);

        // Start threads
        t1.start();
        t2.start();

        sc.close();
    }
}