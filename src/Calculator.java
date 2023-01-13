import java.util.Scanner;

// Napisz program który poprosi użytkownika o 2 liczby a następnie wykona na nich podstawowe operacje matematyczne
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type first number and press Enter.");
        int firstNumber = scanner.nextInt();
        System.out.println("Please type second number and press Enter.");
        int secondNumber = scanner.nextInt();
        System.out.println("Please type third float number for division");
        float thirdNumber = scanner.nextFloat();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int mod = secondNumber % firstNumber;

        System.out.println("Addition result: " + addition);
        System.out.println("Subtraction result: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division result: " + division);
        System.out.println("Modulo result: " + mod);
    }
}
