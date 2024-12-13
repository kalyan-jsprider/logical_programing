package com.jsp;

import java.util.Scanner;

public class assignment5 {
	
	public static void demo(int no) {
		  for(int i=1;i<=no;i++){
	            for(int j=1;j<=(no*2)-2;j++){
	                if(i+j>=no+1 && j-i<=no-1){
	                    if(i+j==no+1 || j-i==no-1){
	                        System.out.print(i+" ");
	                    }else if(i==no){
	                        System.out.print(no+" ");
	                    }
	                    else{
	                        System.out.print(j-i+" ");
	                    }
	                }else{
	                    System.out.print(" ");
	                }
	            }System.out.println();
	        }
		
	}
	    public static void main(String[] args) {
	        Scanner x=new Scanner(System.in);
	        int no=x.nextInt();
	        demo(no);
	        
	    }
	}

