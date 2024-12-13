package com.jsp;

public class task {
public static void main(String[] args) {
	String s = "A12B13C11";
    int i=0;
    while (i<s.length()) {
		char ch=' ';
		String num="";
		if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
			ch=s.charAt(i);
			i++;
		}
		while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9') {
			int no=s.charAt(i)-48;
			num=num+no;
			i++;
			
		}
		int  count=Integer.parseInt(num);
		for (int j = 1; j <=count; j++) {
			System.out.print(ch);
		}
		System.out.println();
    }
}
}
