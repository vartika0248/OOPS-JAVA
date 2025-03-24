import java.util.Scanner;
class Factorial
{
   public static void main(String args[])
   {
    int n1=5,fact1=1,fact2=1;
    for(int i=1;i<=n1;i++)
    {
      fact1=fact1*i;
    }
    System.out.println("Factorial of number 1 = "+fact1);
    System.out.println("Input value for n2: ");
    Scanner sc=new Scanner(System.in);
    int n2=sc.nextInt();
    for(int j=1;j<=n2;j++)
    {
     fact2=fact2*j;
    }
    System.out.println("Factorial of number 2 = "+fact2);
  }


}