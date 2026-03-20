import java.util.Scanner;
//in this code has a mistake 
public class lab4_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String sr = sc.nextLine(); 

        int[] arr = new int[256];
        for (int i = 0; i < sr.length(); i++) {
            char ch = sr.charAt(i); 
            arr[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (arr[i] != 1) {
                System.out.println("This is not a perfect string");
                return;
            }
        }

        System.out.println("This is a perfect string");
        sc.close();
    }
}