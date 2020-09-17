package javademo;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		
		
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		
		
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println(a);
			
			c=a+b;
			a=b;
			b=c;
		}

	}

}
