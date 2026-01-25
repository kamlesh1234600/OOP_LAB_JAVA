import java.util.Scanner;
class Garage{
    double charges=0;
    double hours;
    
    void setHours(double hours){
        this.hours=hours;
    }
    void setCharges(){
        double charge;
        if (hours <= 3) {
            charge = 2.00;
        } else {
            charge = 2.00 + Math.ceil(hours - 3) * 0.50;
        }

        this.charges=this.charges+Math.min(charge, 10.00);

    }
    double getHours(){
        return hours;
    }
    double getCharges(){
        return charges;
    }
};
public class lab2_7{
    public static void main(String[] args) {
        
        double hours;
        Scanner sc=new Scanner(System.in);

        Garage g1=new Garage();
        while(true){

            System.out.println("Enter the hour for the parking(for the quiet -1)");
            hours=sc.nextDouble();

            if(hours==-1) break;

            g1.setHours(hours);
            g1.setCharges();
        }
        System.out.println("The total amount is "+g1.getCharges());
        sc.close();
    }
}
