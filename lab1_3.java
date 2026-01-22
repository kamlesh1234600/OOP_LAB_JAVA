
import java.util.Scanner;

// Interface
interface Calculation {
    void input();
    void sum();
    void average();
    void product();
    void largest();
    void smallest();
}

// Abstract class
abstract class NumberOperations implements Calculation {
    int a, b, c;

    // Input method implemented here
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();
        sc.close();
    }
}

// Concrete class
class Result extends NumberOperations {

    public void sum() {
        System.out.println("Sum = " + (a + b + c));
    }

    public void average() {
        System.out.println("Average = " + (a + b + c) / 3.0);
    }

    public void product() {
        System.out.println("Product = " + (a * b * c));
    }

    public void largest() {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Largest = " + max);
    }

    public void smallest() {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Smallest = " + min);
    }
}

// Main class
public class lab1_3 {
    public static void main(String[] args) {

        Result obj = new Result();

        obj.input();
        obj.sum();
        obj.average();
        obj.product();
        obj.largest();
        obj.smallest();
    }
}
