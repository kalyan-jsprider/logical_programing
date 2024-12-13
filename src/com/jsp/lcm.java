 package com.jsp;

import java.util.Scanner;

public class lcm {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		//read two numbers
		int num1=x.nextInt();
		int num2=x.nextInt();
		int i=num1>num2?num1:num2;//check which is the largest number
		while(true) {
			//if i is a multiple of num1 & num2
			if(i%num1==0 && i%num2==0) {
			//	i is a LCM of num1 & num2
				System.out.println(i);
				break;
			}
			i++;
		}
		
	}

}
