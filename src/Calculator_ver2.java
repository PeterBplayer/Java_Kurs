import java.util.Scanner;

public class Calculator_ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type first number and press Enter.");
        float firstNumber = scanner.nextFloat();
        System.out.println("Please type second number and press Enter.");
        float secondNumber = scanner.nextFloat();

        CalculatorMethods metoda = new CalculatorMethods();

        System.out.println("Addition result: " + metoda.add(firstNumber, secondNumber));
        System.out.println("Subtraction result: " + metoda.sub(firstNumber, secondNumber));
        System.out.println("Multiplication: " + metoda.mult(firstNumber, secondNumber));
        System.out.println("Division result: " + metoda.div(firstNumber, secondNumber));
        System.out.println("Modulo result: " + metoda.mod(firstNumber, secondNumber));
    }
}
