import java.util.Scanner;

public class Sumofevenodd {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        // Initialize variables to store the sum of even and odd digits
        int sumEven = 0, sumOdd = 0;

        // Extract digits and calculate the sum
        while (n != 0) {
            int digit = n % 10; // Get the last digit

            if (digit % 2 == 0) {
                sumEven += digit; // Add to even sum if the digit is even
            } else {
                sumOdd += digit; // Add to odd sum if the digit is odd
            }

            n /= 10; // Remove the last digit
        }

        // Print the sum of even and odd digits
        System.out.println("Sum of even digits: " + sumEven);
        System.out.println("Sum of odd digits: " + sumOdd);
    }
}
