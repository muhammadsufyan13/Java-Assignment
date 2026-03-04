# Java-Assignment
Java program for matrix row, column and diagonal sums.
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = input.nextInt();
        System.out.print("Enter number of columns: ");
        int c = input.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int a = 0; a < r; a++) {
            for (int b = 0; b < c; b++) {
                arr[a][b] = input.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int a = 0; a < r; a++) {
            for (int b = 0; b < c; b++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }

        System.out.println("Row sums:");
        for (int a = 0; a < r; a++) {
            int sum1 = 0;
            for (int b = 0; b < c; b++) {
                sum1 += arr[a][b];
            }
            System.out.println("Row " + (a + 1) + ": " + sum1);
        }

        System.out.println("Column sums:");
        for (int b = 0; b < c; b++) {
            int sum2 = 0;
            for (int a = 0; a < r; a++) {
                sum2 += arr[a][b];
            }
            System.out.println("Column " + (b + 1) + ": " + sum2);
        }

        if (r == c) {
            int d1 = 0;
            for (int a = 0; a < r; a++) {
                d1 += arr[a][a];
            }
            System.out.println("\nForward diagonal sum: " + d1);

            int d2 = 0;
            for (int a = 0; a < r; a++) {
                d2 += arr[a][c - 1 - a];
            }
            System.out.println("Reverse diagonal sum: " + d2);
        } else {
            System.out.println("\nDiagonal sums are only defined for square matrices.");
        }

        input.close();
    }
}
