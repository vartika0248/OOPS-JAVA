import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your operator to perform operation: ");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
          case '+':
                    System.out.println("Addition= "+(a+b));
                    break;
          case '-':
                    System.out.println("Subtraction= "+(a-b));
                    break;
          case '*':
                    System.out.println("Multiplication= "+(a*b));
                    break;
          case '/':
                    if(b==0)
                        System.out.println("Error: Divide by Zero");
                    else
                        System.out.println("Division= "+(a/b));
                    break;
         case '%':
                    if(b==0)
                        System.out.println("Error: Can't find remainder");
                    else
                        System.out.println("Modulas= "+(a%b));
                    break;
        default:
                    System.out.println("Invalid Operator");
        }
        sc.close();
} 
}