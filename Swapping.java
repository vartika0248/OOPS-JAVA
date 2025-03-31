public class Swapping
{
	public static void main(String args[ ])
	{
	int a=10;
	int b=6;
	System.out.println("Before Swapping value of a = "+a);
	System.out.println("Before Swapping value of b = "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping value of a = "+a);
    System.out.println("After Swapping vlue of b = "+b);
	}
}