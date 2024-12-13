package com.jsp;

import java.util.Iterator;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		int result=1;
		for(int i=2; i<=num ;i++) {
			result*=i;
			System.out.println(result);
		}
	}

}
