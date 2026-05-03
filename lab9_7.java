
import java.util.Scanner;

class BankAccount {

    int balance = 600;
    boolean fatherTurn = true;
    boolean cycleComplete = false;

    synchronized void deposit(int amount) {
        while (!fatherTurn && !cycleComplete) 
        {
            try { wait(); } catch (Exception e) {}
        }

        if (cycleComplete) return;

        balance += amount;
        System.out.println("Father deposited: " + amount + " | Balance: " + balance);

        if (balance > 2000) {
            fatherTurn = false;
            notify();
        }
    }

    synchronized void withdraw(int amount) {
        while (fatherTurn && !cycleComplete) {
            try { wait(); } catch (Exception e) {}
        }

        if (cycleComplete) return;

        balance -= amount;
        System.out.println("Son withdrew: " + amount + " | Balance: " + balance);

        if (balance < 500) {
            cycleComplete = true;
            notify();
        }
    }

    // Reset flags for next cycle (IMPORTANT)
    void resetCycle() {
        cycleComplete = false;
        fatherTurn = true;
    }
}

// Father Thread
class Father extends Thread {
    BankAccount acc;

    Father(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        while (!acc.cycleComplete) 
        {
            int amount = (int)(Math.random() * 200) + 1;
            acc.deposit(amount);

            try { Thread.sleep(200); } catch (Exception e) {}
        }
    }
}

// Son Thread
class Son extends Thread {
    BankAccount acc;

    Son(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        while (!acc.cycleComplete) {
            int amount = (int)(Math.random() * 150) + 1;
            acc.withdraw(amount);

            try { Thread.sleep(200); } catch (Exception e) {}
        }
    }
}

// Main Class
public class lab9_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(); // ✅ created once

        char choice;

        do {
            acc.resetCycle(); // reset only flags, NOT balance

            Father f = new Father(acc);
            Son s = new Son(acc);

            f.start();
            s.start();

            try {
                f.join();
                s.join();
            } catch (Exception e) {}
 
            System.out.println("\nCycle Completed!");
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Final Balance: " + acc.balance);
        System.out.println("Program Ended.");

        sc.close();
    }
}
