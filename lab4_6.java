interface Function {
    int evaluate(int value);
}

class Half implements Function {

    public int evaluate(int value) {
        return value / 2;
    }
}

class lab4_6 {

    static int[] calculateHalf(int[] numbers) {

        Function f = new Half();
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = f.evaluate(numbers[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        int[] output = calculateHalf(numbers);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

