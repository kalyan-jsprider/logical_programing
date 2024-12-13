package com.jsp;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		for(int i=1; i<num; i++)
		{
		if (num%i==0) {
			System.out.println(i+",");
			
		}
		}
		System.out.println(num);
		
	}

}
