import java.util.Scanner;

class Movietheater{
    int customer;
    final double  performanceCost=20.0;
    final double  perPersonCost=0.5;
    final double  incomePerPerson=5;
    Movietheater(int customer){
        this.customer=customer;
    }
    void printIncome(){
        double income=incomePerPerson*customer;
        System.out.println("Total income by MovieTheater is "+income);
    }
    void printProfit(){
        double profit=(incomePerPerson*customer)-(performanceCost+(perPersonCost*customer));
        System.out.println("Total profit by MovieTheater is "+profit);
    }
}
public class lab6_2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of custoer :");
        int customer=sc.nextInt();
        Movietheater m1=new Movietheater(customer);
        m1.printIncome();
        m1.printProfit();
        sc.close();
    }
}
