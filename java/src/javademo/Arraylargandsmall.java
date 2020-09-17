package javademo;

public class Arraylargandsmall {

	public static void main(String[] args) {

     int numbers[]= {3,5,7,4,1,3};

     int largest=numbers[0];
     int smallest=numbers[0];



for(int i=1;i<numbers.length;i++)
{
	if(numbers[i]>largest)
	{
		largest=numbers[i];
	}
}


System.out.println("given array is :"+numbers.toString());
System.out.println("largest number is:"+largest);
}
	}


