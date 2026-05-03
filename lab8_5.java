package LAB8;

import java.io.*;

public class lab8_5 {
    public static void main(String[] args) {

        StringBuilder content = new StringBuilder();

        try {
            File f1 = new File("LAB8/sdj.txt");
            BufferedReader br = new BufferedReader(new FileReader(f1));

            String line;

            while ((line = br.readLine()) != null) {

                // Replace "his" with "her"
                line = line.replace("his", "her");

                content.append(line);
                content.append("\n");
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Updated Content:");
        System.out.println(content.toString());
    }
}