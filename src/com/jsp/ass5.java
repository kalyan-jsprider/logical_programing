package com.jsp;

public class ass5 {
	public static void demo(int no) {
		for (int row = 0; row<=no+1; row++) {
			
			for (int col = 1; col<=no; col++)
			{
				
				
		if (col==1 || row+col==no||row-col==1 )	 
				{
					 System.out.print("*"+"");
					
					} 
				
				else {
					System.out.print("  ");
				}
		
		
		
			}
			//print for A
			for (int col = 0; col<=no*3-2; col++){
				if (row+col==no+1|| col-row==no) {
					System.out.print('*');
					
				}
				
				else {
					System.out.print(" ");
				}
				
			}
			
			// print for L
			for (int col = 1; col<=no; col++){
				if (col==1 || row==no+1)  {
					System.out.print('*' +" ");
				
			}
				else {
					System.out.print("  ");
				}
			
			}
			// print for y
			for (int col = 0; col<=no; col++) {
				   if (row == col && row < no / 2)
				   {
	                    System.out.print("* "+" ");
	                } 
				   else if (row + col == no - 1 && row < no / 2)
	                {
	                    System.out.print('*'+ " ");
	                } 
	                else if (row >= no / 2 && col == no / 2)
	                {
	                    System.out.print("*" +" ");
	                } 
	                
	                else {
	                    System.out.print("  ");
	                }

			}
			
			// print for A
			for (int col = 0; col<=no*3-2; col++){
				if (row+col==no+1|| col-row==no+1) {
					System.out.print('*');
					
				}
				else {
					System.out.print(" ");
				}
				
			}
			
//			print for N
			for (int col = 0; col<=no; col++) {
				
					if(col==0 || col == no|| row==col ) {
						System.out.print("*"+" ");
					}
					else
					{
						System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
		
	}  
	public static void main(String[] args) {
	
	demo(5);
	}

}
//for (int row = 1; row<=no-1; row++){
//if (col==1 || row==no*2-1) 
//if (row+col==no+1 || col-row==no-1) 
//if( col-row==1|| row+col==no*2-1  )
//for(int col =1 ; col<=num; col++)
/*{
	if(col==1 || col == num || row==col) {
		System.out.print("*");
	}
	else
	{
		System.out.print(" ");
	}
}*/