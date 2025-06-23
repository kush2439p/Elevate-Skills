import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Welcome to OOp Calculator");

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator ( + , - , * , / ): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number : ");
        double num2 = scanner.nextDouble();

        double result;

          try {
            switch (operator) {
                case '+':
                    result = calc.add(num1, num2);
                    break;
                case '-':
                    result = calc.subtract(num1, num2);
                    break;
                case '*':
                    result = calc.multiply(num1, num2);
                    break;
                case '/':
                    result = calc.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    scanner.close();
                    return;
            }

            System.out.println("Result: " + result);

        }catch(ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
        scanner.close();
}
}
