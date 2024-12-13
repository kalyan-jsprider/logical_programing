package com.jsp;

import java.util.Iterator;
import java.util.Scanner;

public class primeno {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int count =2;
		int num=x.nextInt();
		 for(int i=1; i<=num; i++) {
			 if(num%i==0)
				 count++;
		 }
		 if(count==2)
		 {
			 System.out.println("is prime");
		 }
		 else {
			 System.out.println("is not prime");
		 }
		
	}
	
	
}
