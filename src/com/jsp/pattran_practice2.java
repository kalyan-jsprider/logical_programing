package com.jsp;

public class pattran_practice2 {
	public static void demo(int n) {
		for (int i = 0; i < n; i++) {
            
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(j);
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(" ");
            }

            
            if (i>= 0) { 
                for (int l = (n - i); l >= 1; l--) {
                    System.out.print(l);
                }
            }

            System.out.println();
        }

	}
public static void main(String[] args) {
	demo(4);
}
}
