package javademo;

public class Array {

	public static void main(String[] args) {
		double[] a=new double[5];
		
			
		a[0]=1.5;
		a[1]=2.0;
		a[2]=1.2;
		a[3]=3.4;
		a[4]=3.8;
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}

		double  b=0;
		for(int i=0;i<a.length;i++)
		{
		
		b= b+a[i];
		System.out.println(b);
	}
		
	
	
	
}	
}
		
		