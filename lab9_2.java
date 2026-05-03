package LAB9;
/*2) Creation of a thread by implementing the interface Runnable interface the thread is created and stared by the
constructor of same class. */
// Class implementing Runnable
class MyRunnable implements Runnable {

    Thread t;

    // Constructor
    MyRunnable() {
        t = new Thread(this); // create thread
        t.start();            // start thread
    }

    // run method
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Thread (Even Numbers): " + i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class lab9_2 {

    public static void main(String[] args) {

        new MyRunnable(); // thread starts automatically from constructor
        
        // Main thread work (Odd numbers)
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Main (Odd Numbers): " + i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}