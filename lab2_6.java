import java.util.Scanner;
class CreditCard{
    private int cerditCardNumber;
    private double balanceBeginMonth;
    private double charges=0;
    private double credits=0;
    private double creditCardLimit;

    CreditCard(int cerditCardNumber,double balanceBeginMonth,double creditCardLimit){
        this.balanceBeginMonth=balanceBeginMonth;
        this.cerditCardNumber=cerditCardNumber;
        this.creditCardLimit=creditCardLimit;
    }
    int getCreditCardNumber(){
        return cerditCardNumber;
    }
    double getBalanceBeginMonth(){
        return balanceBeginMonth;
    }
    void setCharges(double charges){
        this.charges=this.charges+charges;
    }
    void setCredits(double credits){
        this.credits=this.credits+credits;
    }
    double getCharges(){
        return charges;
    }
    double getCredits(){
        return credits;
    }
    double newBalance(){
        return balanceBeginMonth+charges-credits;
    }
    boolean cardLimitExceeded(){
        return creditCardLimit<newBalance();
    }
};
public class lab2_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double charges,credits,cardLimit;
        
        System.out.println("Enter the credit card number and balance at begin of month");
        int creditCardNumber=sc.nextInt();
        double balanceBeginMonth=sc.nextDouble();

        System.out.println("Enter credit card limit ");
        cardLimit=sc.nextDouble();

        CreditCard c1=new CreditCard(creditCardNumber, balanceBeginMonth,cardLimit);

        while(true){

            System.out.println("Enter the charges (for quiet enter -1): ");
            charges=sc.nextDouble();

            if(charges==-1) break;

            System.out.println("Enter the credits :");
            credits=sc.nextDouble();
            
            c1.setCharges(charges);
            c1.setCredits(credits);
            
        }

        double newbalance=c1.newBalance();

        System.out.println("The total charges on credit card for month is "+c1.getCharges());
        System.out.println("The total credits on credit card for month is "+c1.getCredits());
        System.out.println("The total balance is  "+(newbalance));

        if(c1.cardLimitExceeded())
            System.out.println("This card limit is exceeded");
        else
            System.out.println("This card limit is not exceeded");
        sc.close();
    }
    
}
