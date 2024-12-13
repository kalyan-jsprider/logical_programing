package com.jsp;

class  fibo1
{
	static void fibo()
	{
		int fib1=0;
		int fib2=1;

		for(int i=1; i<=10; i++)
		{
			int fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}
	}
	public static void main(String[] args) 
	{
		fibo();
	}
}
