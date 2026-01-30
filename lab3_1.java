class Figure{
    double r,a,v;
    Figure(double r){
        this.r=r;
    }
    public void dispArea(){
        System.out.println("The area of cone is "+a);
    }
    public void dispVolume(){
        System.out.println("The volume  of cone is "+v);
    }
};

class Cone extends Figure{
    double h,s;
    Cone(double r,double h,double s){
        super(r);
        this.h=h;
        this.s=s;
    }
    public void calcArea(){
        a = Math.PI * r * s + Math.PI * r * r;
    }
    public void calcVolume(){
        v = (Math.PI * r * r * h) / 3;
    }
};
public class lab3_1 {
    public static void main(String[] args) {
        Cone c1=new Cone(10, 20, 30);
        c1.calcArea();
        c1.calcVolume();
        c1.dispArea();
        c1.dispVolume();
    }
}
