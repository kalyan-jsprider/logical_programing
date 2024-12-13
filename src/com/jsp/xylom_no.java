package com.jsp;

import java.util.Scanner;

public class xylom_no {
	
	public static int operate(int no) {
		int sum=0;
		while (no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10000;
		}
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		        int no=834212;
		        int y=operate(no);
		       int z= operate1(no);
		       if(y==z)
		       {
		    	   System.out.println("xylem no.");
		       }
		       else
		       {
		    	   System.out.println("not a xylem no");
		       }
		              
	}




	public static int operate1(int n) {
		int sum=0;
		while(n!=0)
		{
			int rem=n/10;
			int rem1=rem;
			int rem2=rem%10000;
			int rem3=rem2;
			sum=rem1+rem3;
			n=n/1000000;
			
		}
		return sum;
	}

}
