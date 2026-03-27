
abstract class BaseClass {

    protected String className;
    public BaseClass(String className) {
        this.className = className;
    }

    public void debug(String message) {
        try {
            if (message == null) {
                throw new Exception("Message cannot be null");
            }
            System.out.println("[" + className + " DEBUG]: " + message);
        } catch (Exception e) {
            System.out.println("Debug Error: " + e.getMessage());
        }
    }

    abstract void execute();
}

class Student extends BaseClass {

    public Student() {
        super("Student");
    }

    void execute() {
        debug("Execution started");
        System.out.println("Student is performing task");
    }
}

class Teacher extends BaseClass {

    public Teacher() {
        super("Teacher");
    }

    @Override
    void execute() {
        debug("Execution started");
        System.out.println("Teacher is performing task");
    }
}

// Main Class
public class lab7_5 {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.execute();
        t.execute();

        s.debug(null);
    }
}