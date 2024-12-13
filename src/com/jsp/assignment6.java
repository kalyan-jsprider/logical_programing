package com.jsp;

import java.util.Scanner;

public class assignment6 {
	
	public static void demo(int n) {
		 char ch='Z';
		  for(int i=1;i<=n;i++){
			 
	          for(int j=1;j<=(n*2)-2;j++){
	              if(i+j==n+1 || j-i==n-1||i==n){
	                      System.out.print(i+" ");
	                  }
	                  else if(i+j>=n+1 && j-i<n-1){
	                      System.out.print(ch+" ");
	                      ch--;
	                      
	                  }
	                  
	              else{
	                  System.out.print(" ");
	              }
	          }
	          System.out.println();
	      }
	}
	
	  public static void main(String[] args) {
		  Scanner x=new Scanner(System.in);
	        int n=x.nextInt();
	        demo(n);
	}

}
