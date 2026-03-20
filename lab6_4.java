abstract class Car {
    int speed;   
    void displayCarStatus() {
        System.out.println("Car is running at speed: " + speed + " km/h");
    }
    abstract void avg();
    abstract void mode();
}

class Maruti extends Car {
    void avg() {
        System.out.println("Maruti average is 18 km/l");
    }

    void mode() {
        System.out.println("Maruti fuel mode is Petrol");
    }
}

class Santro extends Car {

    void avg() {
        System.out.println("Santro average is 23 km/l");
    }

    void mode() {
        System.out.println("Santro fuel mode is CNG");
    }
}

public class lab6_4 {
    public static void main(String[] args) {     
        Car c = new Maruti();
        c.speed = 60;
        c.displayCarStatus();
        c.avg();
        c.mode();

        System.out.println();

        c = new Santro();
        c.speed = 50;
        c.displayCarStatus();
        c.avg();
        c.mode();
    }
}