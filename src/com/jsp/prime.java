package com.jsp;

import java.util.Iterator;
import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int no=x.nextInt();
		demo(no);
	}

	private static void demo(int no) {
		int count=0;
	for(int i=1; i<=no; i++){
		if (no%i==0) {
			count++;
		}
	}
		if (count==2) {
			
			System.out.println("this is prime");
		}
		else {
			System.out.println("this is not prime");
		}
	
	
		
	}

}
