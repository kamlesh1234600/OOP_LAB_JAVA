import java.util.Scanner;

class Compare{
    int a,b;
    Compare(int a,int b){
        this.a=a;
        this.b=b;
    }
    public
        void check(){
            if(a>b){
                System.out.println(a+" is larger");
            }
            else if(b>a){
                System.out.println(b+" is larger");
            }
            else{
                System.out.println("the number are equal");
            }
        }

};

public class lab1_2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two integer:");
        int a=input.nextInt();
        int b=input.nextInt();
        Compare kamlesh=new Compare(a, b);
        kamlesh.check();
        input.close();
    }
}
