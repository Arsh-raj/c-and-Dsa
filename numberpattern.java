//Print the following pattern for the given N number of rows

import java.util.Scanner;
public class numberpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            } 
            System.out.println();
        }
    }
}
