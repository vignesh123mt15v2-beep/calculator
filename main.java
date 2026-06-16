package Calculator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        calculator calc = new calculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        
        switch (operator) {
            case '+': result = calc.add(num1, num2); break;
            case '-': result = calc.subtract(num1, num2); break;
            case '*': result = calc.multiply(num1, num2); break;
            case '/': result = calc.divide(num1, num2); break;
            default:  System.out.println("Invalid operator!"); break;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}