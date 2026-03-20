import java.util.Scanner;

class Student{
    String name;
    double phy;
    double che;
    double maths;
    double avg;
    public Scanner sc=new Scanner(System.in);
    String inputName() {
        System.out.println("Enter student name:");
        name = sc.nextLine();
        return name;
    }
    
    boolean average(double phy,double che,double maths){
        avg=(phy+che+maths)/3;
        if(avg>50){
            return true;
        }
        else{
            return false;
        }
    }
};
public class lab5_6 {
    public static void main(String[] args) {
        Student s1=new Student();
        String studentName=s1.inputName();
        
        boolean result=s1.average(90,85,95);

        if (result) {
            System.out.println(studentName + " is PASSED");
        } else {
            System.out.println(studentName + " is FAILED");
        }

    }
}
