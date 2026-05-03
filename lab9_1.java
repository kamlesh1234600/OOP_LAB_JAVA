package LAB9;
//1)Creation of a thread by extending the thread class the thread is created and started in main method of another
//class.
// Class that extends Thread
class MyThread extends Thread {

    public void run() {
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(10); // delay
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class lab9_1 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread(); // create thread object
        t1.start(); // start thread

        // Main thread work
        for (int i = 1; i <=10; i+=2) {
            System.out.println("Main method running: " + i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}