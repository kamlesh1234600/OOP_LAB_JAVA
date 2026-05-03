import java.util.Stack;

// Thread 1 for first part
class Part1 extends Thread {
    String result;

    public void run() {
        Stack<String> stack = new Stack<>();

        String exp = "53*";

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String b = stack.pop();
                String a = stack.pop();
                stack.push(a + ch + b);
            }
        }
        result = stack.pop();
        System.out.println("Part1 Result: " + result);
    }
}

// Thread 2 for second part
class Part2 extends Thread {
    String result;

    public void run() {
        Stack<String> stack = new Stack<>();

        String exp = "84/";

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String b = stack.pop();
                String a = stack.pop();
                stack.push(a + ch + b);
            }
        }
        result = stack.pop();
        System.out.println("Part2 Result: " + result);
    }
}

// Main class
public class lab9_5 {

    public static void main(String[] args) {

        Part1 t1 = new Part1();
        Part2 t2 = new Part2();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Final expression
        String finalExp = t1.result + "+" + t2.result;
        System.out.println("Final Infix Expression: " + finalExp);
    }
}
