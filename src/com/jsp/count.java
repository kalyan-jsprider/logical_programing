package com.jsp;

import java.util.Scanner;

public class count {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		int count=2;
		System.out.println(1+";");
		for(int i=2;i<num; i++)
		{
			if (num%i==0) {
				System.out.println(i+",");
				count++;
			}
		}
		System.out.println(num);
		System.out.println(count);
	}

}
