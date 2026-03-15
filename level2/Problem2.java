import java.util.Scanner;

class Problem2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {

            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Age: ");
            ages[i] = input.nextInt();

            System.out.print("Height: ");
            heights[i] = input.nextDouble();

            if (ages[i] < 0 || heights[i] < 0) {
                System.err.println("Invalid input.");
                System.exit(0);
            }
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < names.length; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);

        input.close();
    }
}