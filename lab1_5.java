import java.util.Scanner;

public class lab1_5{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the five digit number:");
        int a=input.nextInt();
        for(int i=0;i<5;i++){
            int ans=a/(int)Math.pow(10, 5-i-1);
            System.out.print("   "+ans);
            a=a%(int)Math.pow(10, 5-i-1);
        }
        input.close();
    }
}
