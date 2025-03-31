public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        // Post-increment
        System.out.println("Post-increment (a++): " + (a++)); 
        System.out.println("Value of a after post-increment: " + a);
        // Pre-increment
        System.out.println("Pre-increment (++a): " + (++a));
        // Post-decrement
        System.out.println("Post-decrement (b--): " + (b--)); 
        System.out.println("Value of b after post-decrement: " + b);
        // Pre-decrement
        System.out.println("Pre-decrement (--b): " + (--b)); 
    }
}