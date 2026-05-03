package LAB8;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class lab8_1 {
    public static void main(String[] args) {

        int start = -1, end = -1;
        StringBuilder file = new StringBuilder(); //efficient

        try {
            File f1 = new File("LAB8/demo.txt"); 
            FileReader fr = new FileReader(f1);

            int ch;
            while ((ch = fr.read()) != -1) {   
                file.append((char) ch);
            }

            fr.close(); // FIXED (close resource)

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (file.length() < 3) {
            System.out.println("File too small");
            return;
        }

        // First occurrence of "the"
        for (int i = 0; i <= file.length() - 3; i++) {
            if (file.charAt(i) == 't' &&
                file.charAt(i + 1) == 'h' &&
                file.charAt(i + 2) == 'e') {

                start = i;
                break;
            }
        }

        // Last occurrence of "the"
        for (int i = file.length() - 3; i >= 0; i--) {
            if (file.charAt(i) == 't' &&
                file.charAt(i + 1) == 'h' &&
                file.charAt(i + 2) == 'e') {

                end = i;
                break;
            }
        }

        if (start == -1 || end == -1 || start == end) {
            System.out.println("Not enough 'the' found");
            return;
        }

        System.out.println("The resultant string is:");

        for (int i = start + 3; i < end; i++) {
            System.out.print(file.charAt(i));
        }
    }
}