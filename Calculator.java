
public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 20;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num3 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        System.out.println("Exponential"+ Math.pow(num2, num3));
    }
}