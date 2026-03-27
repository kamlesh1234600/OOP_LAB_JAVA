class Teacher {
    double phy;
    double maths;
    double che;
    double eng;
    double result;

    void setMarks(double phy, double maths, double che, double eng) {
        this.phy = phy;
        this.maths = maths;
        this.che = che;
        this.eng = eng;
    }

    void setResult() {
        result = (phy + che + eng + maths) / 4;
    }
}

class Student extends Teacher {
    String studentID;

    Student(String studentID) {
        this.studentID = studentID;
    }

    void getMarks() {
        System.out.println("Student Id: " + studentID);
        System.out.println("Phy: " + phy);
        System.out.println("Che: " + che);
        System.out.println("Maths: " + maths);
        System.out.println("Eng: " + eng);
    }

    void getResult() {
        System.out.println("Student Id: " + studentID);
        System.out.println("Result: " + result);
    }
}

public class lab7_4 {
    public static void main(String[] args) {

        Student s1 = new Student("I25AI003");

        s1.setMarks(89, 95, 85, 70);
        s1.setResult();

        s1.getMarks();
        s1.getResult();
    }
}