package javademo;

public class fibonacci {

	public static void main(String[] args) {
		int s1=1,s2=2,s3,count=15;
		
		
		for(int i=3;i<count;++count)
		{
			s3=s1+s2;
			  System.out.print(" "+s3);    
			s1=s2;
			s2=s3;
			 
		}

	}

}
