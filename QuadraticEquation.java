import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        int a = scanner.nextInt();
        System.out.print("Enter coefficient b: ");
        int b = scanner.nextInt();
        System.out.print("Enter coefficient c: ");
        int c = scanner.nextInt();
        int D = (b * b) - (4 * a * c);
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
		else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is real and repeated: " + root);
        } 
		else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("The roots are imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();
    }
}
