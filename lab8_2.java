package LAB8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class lab8_2 {
    public static void main(String[] args) {

        StringBuilder file = new StringBuilder();

        try {
            File f1 = new File("LAB8/demo2.txt");
            FileReader fr = new FileReader(f1);

            int ch;
            while ((ch = fr.read()) != -1) {
                file.append((char) ch);
            }
            fr.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        List<Integer> a = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        List<Integer> i = new ArrayList<>();
        List<Integer> o = new ArrayList<>();
        List<Integer> u = new ArrayList<>();

        for (int j = 0; j < file.length(); j++) {

            char ch = Character.toLowerCase(file.charAt(j)); 

            if (ch == 'a') a.add(j);
            else if (ch == 'e') e.add(j);
            else if (ch == 'i') i.add(j);
            else if (ch == 'o') o.add(j);
            else if (ch == 'u') u.add(j);
        }

        System.out.println("Positions of vowels:");

        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
    }
}