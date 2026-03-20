
class A{
    A(){
        this(20);
        System.out.println("Class A Without argument constructor is run");
    }
    A(int i){
        super();
        System.out.println("Class A , value of i is "+i);
    }
}
class B extends A{
    B(){
        this(10);
        System.out.println("Class B Without argument constructor is run");
    }
    B(int j){
        super();
        System.out.println("Class B , value of j is "+j);
    }
}
public class lab6_1 {
    public static void main(String[] args) {
        B b=new B();
    }
}
