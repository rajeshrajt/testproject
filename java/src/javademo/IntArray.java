package javademo;

public class IntArray {

public static void main(String[] args) {

int[] a=new int[5];
a[0]=1;
a[1]=1;
a[2]=1;
a[3]=1;
a[4]=1;

//int b[]= {1,2,3};

//for(int i:a)//for each loop concept
{
	//System.out.println(i);
}

//for(int i:b)//for each loop concept
{
	//System.out.println(i);
}

for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}

int total=0;
for(int i=0;i<a.length;i++)
{
	total+=a[i];//step1
	//total=total+a[i];//step2
	
}
System.out.println(total);
	
}}

