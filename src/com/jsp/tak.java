package com.jsp;

public class tak {
	public static void main(String[] args) {
		 String input = "A4B2C3";
	        int count=0;
	        char[] arr = input.toCharArray(); 
	        
	        for (int i = 0; i < arr.length; i += 2) {
	            char ch = arr[i]; 
	            count = arr[i + 1] - '0';  
	            System.out.println(count);
	        
	            for (int j = 0; j < count; j++) {
	                System.out.print(ch);

	            }
	        System.out.println();
	        }
	}

}
