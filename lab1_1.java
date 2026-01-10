
import java.util.Scanner;
public class lab1_1 {
    public static void main(String []args){
        Scanner input=new  Scanner(System.in);
        System.out.println("Enter the two integer :");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("The sum of two integer is :"+(a+b));
        System.out.println("The product of two integer is :"+a*b);
        System.out.println("The difference of two integer is :"+(a-b));
        if(b!=0){
            System.out.println("The quotient of two integer is :"+(a/b));
        }
        else{
            System.out.println("Here value of b is zero");
        }
        input.close();
    }

    
}
