package com.jsp;
import java.util.Scanner;
public class split {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		int con=count(num,count);
		System.out.println(con);
		devid(num,con);

	}

	private static void devid(int num, int con) {
		String first="";
		int first1=0;
		String last="";
		for(int i=1;i<=con/2;i++) {
			
				int rem1=num%10;
			  first1=first1*10+rem1;
				num/=10;
			
		}
		last=last+num;
		String fist2=revers(first1);
		System.out.println(last);

		digitmul(last);
		digitmul(fist2);
		
	}

	private static void digitmul(String last) {
	int mul1;
	String a="";
	String b = "";
	for(int i=0;i<last.length();i++) {
		if(i%2==0) {
			a=a+last.charAt(i);
		}
		else {
			 b=b+last.charAt(i);
		}
	}
	//System.out.println(a);
	//System.out.println(b);
	int m1=Integer.parseInt(a);
	int m2=Integer.parseInt(b);
	int ans=m1*m2;
	System.out.println("the final answer:"+ans);
		
	}

	private static String revers(int first1) {
		String f1="";
		int sum=0;
		while(first1!=0) {
			int rem1=first1%10;
			sum=sum*10+rem1;
			first1/=10;
		}
		f1=f1+sum;
		System.out.println(f1);
		return f1;
	}

	private static int count(int num, int count) {

	while(num!=0) {
		num/=10;
		count++;
	}
	return count;
		
	}


	}


