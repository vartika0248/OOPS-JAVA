import java.util.Scanner;
public class ComplexNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part of the complex number: ");
        int realPart = scanner.nextInt();
        System.out.print("Enter the imaginary part of the complex number: ");
        int imaginaryPart = scanner.nextInt();
        if(imaginaryPart==0)
		     System.out.println("Purely Real");
	    else if(realPart==0)
		     System.out.println("Purely Imaginary");
		else  
		     System.out.println("The complex number is: " + realPart + " + " + imaginaryPart + "i");

        scanner.close();
    }
}
