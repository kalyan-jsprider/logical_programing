package com.jsp;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the no:");
		int no=x.nextInt();
		even(no);
	}

	private static void even(int no) {
		if (no%2==0) {
			System.out.println("this is even no");
		}
		else if (no%2==1) {
			
				System.out.println("this is odd");
			
		} 
	}

}
