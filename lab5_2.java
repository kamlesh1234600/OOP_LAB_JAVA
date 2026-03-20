

import java.util.Scanner;

class InValidHexadecimal extends Exception{
    InValidHexadecimal(String str){
        super(str);
    }
}

class Hexadecimal{
    private String str;
    Hexadecimal(String str){
        this.str=str;
    }
    void isValid() throws InValidHexadecimal{       
        if(str==null || str.length()==0){
            throw new InValidHexadecimal("Input is Empty");
        }
        int start=0;
        for(int i=start;i<str.length();i++){
            char ch=str.charAt(i);
            boolean valid =(ch>='0' && ch<='9') || (ch>='a' && ch<='f') || (ch>='A' && ch<='F');
            if(!valid) throw new InValidHexadecimal("Invalid character "+ch+" at position "+i);
        }   
    }
};
public class lab5_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a HexaDecimal Number");
        String num=sc.next();
        Hexadecimal h1=new Hexadecimal(num);
        try {
            h1.isValid();
            System.out.println("Valid Hexadecimal Number");
        } catch (InValidHexadecimal exp) {
            System.out.println("Not a Hexadecimal Number");
            System.out.println("Reason: " + exp.getMessage());
        } finally {
            System.out.println("Ending the program");
        }

        sc.close();
    }
}
