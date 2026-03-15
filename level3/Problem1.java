import java.util.Scanner;

class Problem1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid number.");
            System.exit(0);
        }

        int temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit Frequencies:");

        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }

        input.close();
    }
}