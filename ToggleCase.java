import java.util.Scanner;
public class ToggleCase {
    public static char toggleCase(char ch) {
        return (char) (ch ^ ' ');
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        char toggledChar = toggleCase(ch);
        System.out.println("Toggled character: " + toggledChar);
        scanner.close();
    }
}