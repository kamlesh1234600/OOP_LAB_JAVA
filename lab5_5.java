class Salary{
    int hour;
    int perHour=12;
    int grossSalary=0;
    Salary(int hour){
        this.hour=hour;
        grossSalary=hour*perHour;
    }
    double taxPay(){
        return grossSalary*15.0/100;
    }
    double netPay(){
        return grossSalary-(grossSalary*15.0/100);
    }

};
public class lab5_5 {
    public static void main(String[] args) {
        Salary s1=new Salary(21);
        System.out.println("pay for the tax is :"+s1.taxPay());
        System.out.println("netpay is :"+s1.netPay());
    }
}
