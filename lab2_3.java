class Employee{
    private String fName;
    private String lName;
    private double salary;
    Employee(String fName,String lName,double salary){
        this.fName=fName;
        this.lName=lName;
        setSalary(salary);
    }

    void setSalary(double salary){
        if(salary<0) this.salary=0;
        else this.salary=salary;
    }
    void setfName(String fName){
        this.fName=fName;
    }
    void setlName(String lName){
        this.lName=lName;
    }

    void setHike(){
        salary=salary+salary*0.1;
    }

    double getSalary(){
        return salary;
    }
    String getfName(){
        return fName;
    }
    String getlName(){
        return lName;
    }

}
public class lab2_3 {
    public static void main(String[] args) {

        Employee e1=new Employee("Kamlesh", "Prajapati", 10000);
        Employee e2=new Employee("Prince", "Prajapati", 15000);

        System.out.println("Employee e1 details");
        System.out.println("The name of the e1 is "+e1.getfName()+" "+e1.getlName());
        System.out.println("The yearly salary of this employee is "+12*e1.getSalary());

        System.out.println("Employee e2 details");
        System.out.println("The name of the e2 is "+e2.getfName()+" "+e2.getlName());
        System.out.println("The yearly salary of this employee is "+12*e2.getSalary());

        e1.setHike();
        e2.setHike();
        
        System.out.println("After 10% hike the yearly salary of the employee 1 is "+12*e1.getSalary());
        System.out.println("And the yearly salary of the employee 2 after the 10% hike is "+12*e2.getSalary());
    }
}
