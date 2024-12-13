package com.jsp;

public class octal_no {
	public static void main(String[] args) {
		String s="1010";
		int j=0;
		int sum=0;
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			int n=ch-'0';
			sum+=(int)(n*(Math.pow(2, j)));
			j++;
		}
		System.out.println(sum);
	}

}
