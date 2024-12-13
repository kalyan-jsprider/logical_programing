package com.jsp;

public class large {
	
		public static void largest(int no) {
			int large=0;
			while (no!=0) {
				int rem=no%10;
			
				if (rem>large) { 
					large=rem;
				}
			  	no=no/10;
			}
			System.out.println("the largest no"+" "+large);
			
		}
		public static void main(String[] args) {
			largest(546872);
		}

	}


