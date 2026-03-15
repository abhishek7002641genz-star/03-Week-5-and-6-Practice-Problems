import java.util.Scanner;

class Problem3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limit = 10;

        int[] results = new int[limit];

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid number.");
            System.exit(0);
        }

        // Store multiplication results
        for (int i = 0; i < results.length; i++) {
            results[i] = number * (i + 1);
        }

        // Display table
        System.out.println("\nMultiplication Table:");

        for (int i = 0; i < results.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }

        input.close();
    }
}