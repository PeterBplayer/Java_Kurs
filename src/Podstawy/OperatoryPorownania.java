package Podstawy;

import java.util.Scanner;

//Porównują elementy równania i zwracają logiczną wartość typu boolean (true/false)
public class OperatoryPorownania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type first number and press Enter.");
        int firstNumber = scanner.nextInt();
        System.out.println("Please type second number and press Enter.");
        int secondNumber = scanner.nextInt();

        System.out.println("first number = second number: " + (firstNumber == secondNumber));// dla porównia musi być "==",
        // znak "=" służy do PRZYPISYWANIA wartości i nie jest operatorem porównawczym
        System.out.println("first number != second number: " + (firstNumber != secondNumber));
        System.out.println("first number > second number: " + (firstNumber > secondNumber));
        System.out.println("first number < second number: " + (firstNumber < secondNumber));
        System.out.println("first number >= second number: " + (firstNumber >= secondNumber));
        System.out.println("first number <= second number: " + (firstNumber <= secondNumber));

    }

}
