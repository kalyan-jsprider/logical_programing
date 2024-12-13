package com.jsp;

public class practice {
	

	    public static void main(String[] args) {
	        String input = "7596ab@!"; // Input string
	        int sum = 0;
	        StringBuilder digits = new StringBuilder();

	        // Iterate through each character in the input string
	        for (char ch : input.toCharArray()) {
	            // Check if the character is a digit
	            if (Character.isDigit(ch)) {
	                // Convert character to integer
	                int digit = Character.getNumericValue(ch);
	                
	                // Append digit to the StringBuilder
	                if (digits.length() > 0) {
	                    digits.append("+"); // Add "+" between digits
	                }
	                digits.append(digit);
	                
	                // Add digit to sum
	                sum += digit;
	            }
	        }

	        // Print the result in the required format
	        System.out.println(digits + "=" + sum);
	    }
	}


