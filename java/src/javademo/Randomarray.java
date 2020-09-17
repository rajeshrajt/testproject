package javademo;

import java.util.Random;

public class Randomarray {

	public static void main(String[] args) {
		Random r=new Random();
		int a[]=new int [10];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt(50);
		}
		
		
         for(int i=4;i<a.length;i++)
         {
        	 System.out.println(i);
         }
	}

}
