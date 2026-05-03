
import java.util.Scanner;
import java.util.Random;

// Thread for Player
class Player extends Thread {

    int playerNumber;
    int randomValue;

    Player(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void run() {
        Random rand = new Random();
        randomValue = rand.nextInt(100); // random number (0-99)
        System.out.println("Player " + playerNumber + " got: " + randomValue);
    }
}

// Main class
public class lab9_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Just for engagement (not used)
        System.out.print("Player 1, enter any number: ");
        int p1 = sc.nextInt();

        System.out.print("Player 2, enter any number: ");
        int p2 = sc.nextInt();

        // Create threads
        Player player1 = new Player(1);
        Player player2 = new Player(2);

        // Start threads
        player1.start();
        player2.start();

        try {
            player1.join(); // wait for completion
            player2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Decide winner
        if (player1.randomValue > player2.randomValue) {
            int points = player1.randomValue - player2.randomValue;
            System.out.println("Player 1 wins! Points: " + points);
        } 
        else if (player2.randomValue > player1.randomValue) {
            int points = player2.randomValue - player1.randomValue;
            System.out.println("Player 2 wins! Points: " + points);
        } 
        else {
            System.out.println("It's a tie!");
        }

        sc.close();
    }
}
