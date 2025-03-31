public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;   
        int b = 3;   
        int AND = a & b;
        System.out.println("a & b = " + AND); 
        int OR = a | b;
        System.out.println("a | b = " + OR); 
        int XOR = a ^ b;
        System.out.println("a ^ b = " + XOR); 
        int NOT = ~a;
        System.out.println("~a = " + NOT); 
        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift); 
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift); 
        int unsignedRightShift = a >>> 1;
        System.out.println("a >>> 1 = " + unsignedRightShift); 
    }
}
