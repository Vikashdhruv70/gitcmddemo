package com.vnc.demogitcmd;

public class TestDemo {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		subtract(a,b);
		add(a,b);
		multiply(a,b);

	}
	public static void subtract(int a, int b) {
	int	c=a-b;
		System.out.println(c+"sub result");
				
	}
	
	public static void add(int a, int b) {
		int	c1=a+b;
			System.out.println(c1+"add result");
					
		}
	public static void multiply(int a, int b) {
		int	c3=a*b;
			System.out.println(c3+"multiply result");
					
		}


}
