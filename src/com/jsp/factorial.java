package com.jsp;

import java.util.Scanner;

public class factorial {
	private static void fact(int num) {
		for(int i=1; i<num; i++)
		{
		if (num%i==0) {
			System.out.println(i+",");
			
		}
		}
		System.out.println(num);
		
	}

	public static void main(String[] args) {
		
	fact(1265);

}
}