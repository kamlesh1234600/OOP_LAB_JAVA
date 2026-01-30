abstract class Figure {
    double a,v;
    public static final double PI=3.1420;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void dispArea();
    public abstract void dispVol();
}
class Cone extends Figure{
    double n,s;
    Cone(double n,double s){
        this.n=n;
        this.s=s;
    }
    public void calcArea(){
        a = PI * n * s + PI * n * n;    }
    public void calcVol(){
        
        v = (PI * n * n *  Math.sqrt((s * s) -( n * n))) / 3;
    }
    public void dispArea(){
        System.out.println("The Area of Cone is "+a);
    }
    public void dispVol(){
        System.out.println("The volume of Cone is "+v);
    }
}
 
class Sphere extends Figure{
    double R;
    Sphere(double R){
        this.R=R;
    }
    public void calcArea(){
        a=4*PI*R*R;
    }
    public void calcVol(){
        v=(4*PI*R*R*R)/3;
    }
    public void dispArea(){
        System.out.println("The Area of Sphere is "+a);
    }
    public void dispVol(){
        System.out.println("The volume of Sphere is "+v);
    }
}

class Cylinder extends Figure{
    double r,h;
    Cylinder(double h,double r){
        this.h=h;
        this.r=r;
    }
    public void calcArea(){
        a=2*PI*r*(r+h);
    }
    public void calcVol(){
        v=(PI*r*r*h);
    }
    public void dispArea(){
        System.out.println("The Area of Cylinder is "+a);
    }
    public void dispVol(){
        System.out.println("The volume of Cylinder is "+v);
    }
}
public class lab3_2 {
    public static void main(String[] args) {
        Cone c=new Cone(10, 20);
        c.calcArea();
        c.calcVol();
        c.dispArea();
        c.dispVol();
        Sphere s=new Sphere(10);
        s.calcArea();
        s.calcVol();
        s.dispArea();
        s.dispVol();
        Cylinder cy=new Cylinder(10, 2);
        cy.calcArea();
        cy.calcVol();
        cy.dispArea();
        cy.dispVol();
    }
}
