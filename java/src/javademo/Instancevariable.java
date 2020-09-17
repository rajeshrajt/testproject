package javademo;

public class Instancevariable {
	  int a=10;//instant variable
	  static int c=30;//static variable
	 
	public static void main(String[] args) {
	

		int b=20;//local variable
		
		
		System.out.println(b);
		System.out.println(c);
		
		Instancevariable raj=new Instancevariable();
		System.out.println(raj.a);
		

	}

}
