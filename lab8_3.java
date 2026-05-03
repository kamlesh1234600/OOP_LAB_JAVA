package LAB8;

import java.io.*;
import java.util.*;

public class lab8_3 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        try {
            File f1 = new File("LAB8/names.txt");
            BufferedReader br = new BufferedReader(new FileReader(f1));

            String line;

            while ((line = br.readLine()) != null) {

                if (line.length() > 3) {
                    String modified = line.substring(3);
                    names.add(modified);
                }
            }

            br.close();

        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }

        Collections.sort(names);

        System.out.println("Names after removing first 3 characters and sorting:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}