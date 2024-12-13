package com.jsp;

public class stringplindrome {
		
		public static void main(String[] args) {
			String s="madam";
			String rev="";
			for (int i =s.length()-1; i >=0; i--) {
			  rev=rev+s.charAt(i);
			 
			}
			 if (s.equals(rev)) {
					System.out.println("this is palindrome");
				}
				  else {
					System.out.println("this is not a palindrome");
				}
		}

		

	}

