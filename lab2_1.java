
import java.util.Scanner;

class DrivingCost{
    double miles;
    double costPerGallon;
    double avgFees;
    double tolls;
    final double milesPerGallon=25.0;

    DrivingCost(double miles,double costPerGallon,double avgFees,double tolls){
        this.miles= miles;
        this.costPerGallon= costPerGallon;
        this.avgFees= avgFees;
        this.tolls= tolls;
    }

    void displayCost(){
        double cost=(miles/milesPerGallon)*costPerGallon+avgFees+tolls;
        System.out.println("The total cost per day is"+cost);
    }
    
}

public class lab2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double miles = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter average fees per day: ");
        double avgFees = sc.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = sc.nextDouble();

        DrivingCost d1=new DrivingCost(miles,costPerGallon, avgFees, tolls);
        d1.displayCost();
        
        sc.close();
    } 
}
