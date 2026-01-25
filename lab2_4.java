import java.util.Scanner;
class Date{
    int month;
    int day;
    int year;
    Date(int month,int day,int year){
        this.month=month;
        this.year=year;
        this.day=day;
    }

    void setMonth(int month){
        this.month=month;
    } 
    void setYear(int year){
        this.year=year;
    }
    void setDay(int day){
        this.day=day;
    }

    int getMonth(){
        return month;
    }
    int getDay(){
        return day;
    }
    int getYear(){
        return year;
    }

    void displayDate(){
        System.out.println(month + "/" + year + "/" + day);
    }
    
};

public class lab2_4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the day :");
        int day=sc.nextInt();

        System.out.println("Enter the month :");
        int month=sc.nextInt();

        System.out.println("Enter the year :");
        int year=sc.nextInt();

        Date d1=new Date(month, day, year);
        d1.displayDate();
        
        sc.close();
    }
}
