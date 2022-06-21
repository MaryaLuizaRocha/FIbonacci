package Sequencia;

import java.util.Scanner;

public class Fibonacci {
	    
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			System.out.print("Entre com um número: "); 
			int x = ler.nextInt();
			
			for (int i = 1; i <= 1; i++) 
			{
				long f = fib(i); 
				System.out.println("fib(" + i + ") = " + f);
			}
		}
			
			public static long fib(int a) {
				if (a <= 2) return 1;
				else return fib(a–1) + fib(a–2);
			}	
	    }
	
    
