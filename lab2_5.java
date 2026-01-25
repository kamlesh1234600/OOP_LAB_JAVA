import java.util.Scanner;
class Trip {
    private double miles;
    private double gallons;

    Trip(double miles, double gallons) {
        this.miles = miles;
        this.gallons = gallons;
    }

    
    double getMilesPerGallon() {
        return miles / gallons;
    }

    double getMiles() {
        return miles;
    }

    double getGallons() {
        return gallons;
    }
}


public class lab2_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalMiles = 0;
        double totalGallons = 0;
        int tripCount = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            double miles = sc.nextDouble();

            if (miles == -1)
                break;

            System.out.print("Enter gallons used: ");
            double gallons = sc.nextDouble();

            Trip trip = new Trip(miles, gallons);

            tripCount++;
            totalMiles += trip.getMiles();
            totalGallons += trip.getGallons();

            System.out.println(
                "Miles per gallon for trip " + tripCount + " is " +
                trip.getMilesPerGallon()
            );

            System.out.println(
                "Combined miles per gallon so far: " +
                (totalMiles / totalGallons)
            );
        }

        sc.close();
    }
}
