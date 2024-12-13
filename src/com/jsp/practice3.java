package com.jsp;

public class practice3 {
public static void main(String[] args) {
	int n=199;
	String s="";
	while (n!=0) {
		int rem=n%16;
		if (rem>=10) {
			char ch=(char)(rem+55);
			s=ch+s;
		}else {
			s=rem+s;
		}
		
		n/=16;
		
	}
	System.out.println(s);
}

}
