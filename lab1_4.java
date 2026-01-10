import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the the radius of circle in integer:");
        int r=input.nextInt();
        System.out.println("The diameter of circle is :"+2*r);
        System.out.println("The circumfrence of circle is:"+2*Math.PI*r);
        System.out.println("The area of circle is :"+Math.PI*r*r);
        input.close();
    }
}
