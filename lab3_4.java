package FigPackage;

abstract class Figure {
    double r, a, v;
    public static final double PI = 3.1428;

    public abstract void calcArea();
    public abstract void calcVolume();
    public abstract void dispArea();
    public abstract void dispVolume();
}

class Cone extends Figure {
    double s, h;

    Cone(double r, double s, double h) {
        this.r = r;
        this.s = s;
        this.h = h;
    }

    public void calcArea() {
        a = (PI * r * s) + (PI * r * r);
    }

    public void calcVolume() {
        v = (PI * r * r * h) / 3;
    }

    public void dispArea() {
        System.out.println("Area of Cone = " + a);
    }

    public void dispVolume() {
        System.out.println("Volume of Cone = " + v);
    }
}

class Sphere extends Figure {

    Sphere(double r) {
        this.r = r;
    }

    public void calcArea() {
        a = 4 * PI * r * r;
    }

    public void calcVolume() {
        v = (4 * PI * r * r * r) / 3;
    }

    public void dispArea() {
        System.out.println("Area of Sphere = " + a);
    }

    public void dispVolume() {
        System.out.println("Volume of Sphere = " + v);
    }
}

class Cylinder extends Figure {
    double h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        a = (2 * PI * r * r) + (2 * PI * r * h);
    }

    public void calcVolume() {
        v = PI * r * r * h;
    }

    public void dispArea() {
        System.out.println("Area of Cylinder = " + a);
    }

    public void dispVolume() {
        System.out.println("Volume of Cylinder = " + v);
    }
}

public class lab3_4 {
    public static void main(String[] args) {

        Cone c = new Cone(10, 15, 12);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();

        Sphere s = new Sphere(7);
        s.calcArea();
        s.calcVolume();
        s.dispArea();
        s.dispVolume();

        Cylinder cy = new Cylinder(5, 10);
        cy.calcArea();
        cy.calcVolume();
        cy.dispArea();
        cy.dispVolume();
    }
}
