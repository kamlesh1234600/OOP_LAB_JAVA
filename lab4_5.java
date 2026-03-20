import java.util.Scanner;

class lab4_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        int count = 0;

        for (int i = a; i <= b; i++) {
            String number = i + "";
            if (number.contains(pattern))
                count++;
        }

        System.out.println("Pattern occurred " + count + " times");

        sc.close();
        
    }
}

