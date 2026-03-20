import java.util.Scanner;

public class lab4_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String sr=sc.nextLine();
        int n;
        System.out.println("enter a frequency :");
        n=sc.nextInt();
        int[] arr = new int[256];
        for(int i=0;i<sr.length();i++){
            arr[sr.charAt(i)]+=1;
        }
        for(int i=0;i<256;i++){
            if(arr[i]==n){
                System.out.println((char)(i));
            }
        }
        sc.close();
    }
}
