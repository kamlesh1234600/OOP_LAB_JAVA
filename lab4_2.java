import java.util.Scanner;

public class lab4_2 {

    static void check(String sr){
        int size=sr.length(),numDigit=0,numLower=0 ;
        
        if(size>4 && size<13){
            for (int i = 0; i < sr.length(); i++) {
            char ch = sr.charAt(i);

            if (Character.isUpperCase(ch)) {
                System.out.println("False");
                return;
            } else if (Character.isLowerCase(ch)) {
                numLower++;
            } else if (Character.isDigit(ch)) {
                numDigit++;
            } else {
                System.out.println("False");
                return;
            }
            
            }
            if(numDigit>0 && numLower>0){
                char prev=sr.charAt(0);
                for(int i=1;i<size;i++){
                    if(prev==sr.charAt(i)){
                        System.out.println("False");
                        return;
                    }
                    prev=sr.charAt(i);
                }
                System.out.println("True");
            }
            else{
                System.out.println("False");
                return;
            }

        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sr;
        System.out.println("enter the password");
        sr=sc.next();
        check(sr);
        sc.close();
    }
}
