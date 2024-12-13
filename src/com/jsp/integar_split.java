package com.jsp;

 import java.util.Scanner;

public class integar_split {

    // Method to split an integer into two-digit chunks
    public static void number(int no) {
        while (no != 0) {
            int rem = no % 100;  // Get last two digits
            System.out.println(rem);  // Print the chunk
            no = no / 100;  // Remove the last two digits
        }
    }

    // Method to reverse an integer
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        // Split the number into two-digit chunks
        System.out.println("Splitting the number:");
        number(number);

        // Reverse the integer
        int reversedNumber = reverse(number);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}

