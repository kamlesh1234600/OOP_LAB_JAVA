class Bank{    
    double balance;
    double amount;
    double deposit(double amount,double balance){
        balance+=amount;
        return balance;
    }
    double withdrow(double amount,double balance){
        if(balance>=amount){
            balance-=amount;
            return balance;
        }
        else return 0;
    }
}
public class lab6_5 {
    public static void main(String[] args) {
        Bank b1=new Bank();
        double balance=0;
        
        balance = b1.deposit(1000, balance);
        System.out.println("Balance after deposit 1000 rupees " + balance);

        balance = b1.deposit(3000, balance);
        System.out.println("Balance after deposit 3000 rupees " + balance);

        balance = b1.withdrow(2000, balance);
        System.out.println("Balance after withdraw 2000 rupees " + balance);

    }
}
