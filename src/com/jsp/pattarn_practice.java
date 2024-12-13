package com.jsp;

public class pattarn_practice {
	public static void demo(int no) {
		for (int i = no; i > 0; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(j);
	        }
	        System.out.println(); 
	    }
		
	}
	
public static void main(String[] args) {
	demo(4);
	
}
}
