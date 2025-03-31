import java.util.Scanner;
public class MaxOfTwoNumbers {
    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int max = getMax(num1, num2);
        System.out.println("Maximum number is: " + max);
        scanner.close();
    }
}