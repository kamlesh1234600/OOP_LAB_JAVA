package LAB8;

import java.io.*;

public class lab8_4 {
    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();

        try {
            File f1 = new File("LAB8/demo2.txt");
            BufferedReader br = new BufferedReader(new FileReader(f1));

            String line;

            while ((line = br.readLine()) != null) {

                boolean newWord = true;

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    if (Character.isWhitespace(ch)) {
                        result.append(ch);
                        newWord = true;
                    } else {
                        if (newWord) {
                            result.append(Character.toUpperCase(ch));
                            newWord = false;
                        } else {
                            result.append(ch);
                        }
                    }
                }

                result.append("\n"); // Move to next line
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Result:");
        System.out.println(result.toString());
    }
}