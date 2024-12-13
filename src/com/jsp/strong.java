package com.jsp;

public class strong {
	static void strongno (int no)
	{
		int sum=0;
		int copy=no;
		while (no!=0)
		{
			int rem=no%10;

				int fact=1;

			for(int i=1; i<=rem; i++)
			{
				fact=fact*i;
			}
		sum=sum+fact;
			no=no/10;

		}
	if(sum==copy)
		{
			System.out.println(copy+"It is a strong");
		}
        
	else {
		{
		    System.out.println("It is not a strong ");
	    }
	}

	}
	public static void main(String[] args) 
	
	{
	   strongno(145);
	}
	}


