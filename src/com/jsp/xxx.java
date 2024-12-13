package com.jsp;

import java.util.Scanner;

public class xxx {
    
    // Function to reverse the digits of a number
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = x.nextInt();
        x.close();

        // Edge case handling
        if (no < 10) {
            System.out.println("Number is too small to be a xylom or phelom number.");
            return;
        }

        int lastDigit = no % 10;        // Extract the last digit
        int remainingNumber = no / 10;  // Number without the last digit
        
        // Reverse the remaining number
        int revSet = reverse(remainingNumber);

        // Calculate the sum of the first and last digits of the original number
        int firstDigit = remainingNumber % 10;
        int eDigitSum = firstDigit + lastDigit;
        
        // Calculate the sum of the digits of the reversed number
        int midDig = revSet;
        int midSum = 0;
        while (midDig != 0) {
            midSum += midDig % 10;
            midDig = midDig / 10;
        }
        
        // Check if the calculated sum matches the digit sum
        if (eDigitSum == midSum) {
            System.out.println("This is a xylom number.");
        } else {
            System.out.println("This is a phelom number.");
        }
    }
}
