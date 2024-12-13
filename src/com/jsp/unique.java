package com.jsp;


public class unique {
	public static void uni(int num) {
		boolean responce=true; 
		while (num!=0) {
			int rem1=num%10;
			int count=num/10;
			while (count!=0) {
				int rem2=count%10;
				if (rem1==rem2) {
					responce=false;
				
					}
				break;
				}
			num=num/10;
		}
		if (responce==true) {
			System.out.println("unique");	
		}
		else {
			System.out.println("this is not a unique");
		}	
		
	}
public static void main(String[] args) {
	uni(9988);
	
				
		
	}
}

 