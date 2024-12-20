/*

Task 2: Multiplication Table Using 2D Array
Write a program that generates a multiplication table using a 2D array. The size of the table (e.g.
n×n) should be input by the user. Populate the 2D array with the multiplication values and display
the table in matrix form.
Example Input
Enter size of multiplication table: 5

*/
/*

Nichita Selchin , Student No : sba24331

Repository link : https://github.com/Nichita777/Task2

*/



package com.mycompany.task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the multiplication table
        System.out.print("Enter size of multiplication table: ");
        int size = scanner.nextInt();

        // Initialize the 2D array for the multiplication table
        int[][] table = new int[size][size];

        // Populate the 2D array with multiplication values
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1); // Row index + 1 times Column index + 1
            }
        }

        // Display the multiplication table in matrix form
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + "\t"); // Use tabs for formatting
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
