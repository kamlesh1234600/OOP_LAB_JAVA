class X{
    int i,j;
    X(int i,int j){
        this.i=i;
        this.j=j;
    }
    public int final_sum(){
        return i+j;
    }
    public int find_difference() {
        return i - j;
    }
};

class Y extends X{
    Y(int i,int j){
        super(i, j);
    }
    public int find_product(){
        return i*j;
    }
};

class Z extends Y{
    Z(int i,int j){
        super(i, j);
    }

};
public class lab3_3 {
    public static void main(String[] args) {
        Z a=new Z(10,20);
        System.out.println("The sum of two values is "+a.final_sum());
        System.out.println("The differences of two values is "+a.find_difference());
        System.out.println("The product of two values is "+a.find_product());
    }
}
