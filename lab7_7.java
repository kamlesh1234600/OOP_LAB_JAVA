enum Result {
    CORRECT, WRONG, UNANSWERED
}

class QuizEvaluator {
    
    char[] answer = {'C','A','B','D'};
    char[] submitted;
    Result[] results = new Result[4];

    int correct = 0;
    int wrong = 0;
    int unanswered = 0;

    QuizEvaluator(char[] submitted) {
        this.submitted = submitted;
    }

    void calculateResult() {
        for (int i = 0; i < 4; i++) {
            if (submitted[i] == 'X') {
                results[i] = Result.UNANSWERED;
                unanswered++;
            } 
            else if (submitted[i] == answer[i]) {
                results[i] = Result.CORRECT;
                correct++;
            } 
            else {
                results[i] = Result.WRONG;
                wrong++;
            }
        }
    }

    void printResult() {
        System.out.println("QUESTION\tSUBMITTED\tCORRECT\tRESULT");

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "\t\t" + submitted[i] + "\t\t" + answer[i] + "\t\t" + results[i]);
        }

        System.out.println("\nNo. of correct answers: " + correct);
        System.out.println("No. of wrong answers: " + wrong);
        System.out.println("No. of unanswered questions: " + unanswered);

        if (correct >= 2)
            System.out.println("The candidate passed.");
        else
            System.out.println("The candidate failed.");
    }
}

public class lab7_7 {
    public static void main(String[] args) {

        try {
            
            if (args.length != 4) {
                throw new Exception("Please enter exactly 4 answers as arguments.");
            }

            char[] arr = new char[4];
            for (int i = 0; i < 4; i++) {
                // Convert to uppercase and take first character
                arr[i] = args[i].toUpperCase().charAt(0);

                // Validate input
                if (arr[i] != 'A' && arr[i] != 'B' && arr[i] != 'C' &&
                    arr[i] != 'D' && arr[i] != 'X') {
                    throw new Exception("Invalid input: Only A, B, C, D, X allowed.");
                }
            }

            QuizEvaluator q = new QuizEvaluator(arr);
            q.calculateResult();
            q.printResult();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}