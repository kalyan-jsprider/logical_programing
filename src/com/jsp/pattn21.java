package com.jsp;

import java.util.Scanner;

public class pattn21 {
	
			public static void demo(int no) {
				char chr='a';
			
					for (int row = 1; row<=no; row++) {
						
										
						for (int col=1; col<=no; col++){
							
							if (row+col>=no+1 ) 
							{
								if (col%2==1) {
									System.out.print(row+" ");
								}
								else 
								{
									System.out.print(chr+" ");
								}
								
							}
						
							else {
								System.out.print("  ");
								
								
							}
							
							
						}
						chr++;
						System.out.println();
					}
					
				}  
			public static void main(String[] args) {
				Scanner x= new Scanner(System.in);
				int no=x.nextInt();
				demo(no);
				
			}
		}

