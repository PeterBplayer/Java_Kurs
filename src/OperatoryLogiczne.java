import java.util.Scanner;

//Działają na wartościach logicznych zwracając również wartość logiczną typu boolean (true/false)
public class OperatoryLogiczne {
    public static void main(String[] args) {
//Wprowadzenie dwóch liczb z klawiatury
        Scanner input = new Scanner(System.in);
        System.out.println("Please type first number and press Enter.");
        int firstNumber = input.nextInt();
        System.out.println("Please type second number and press Enter.");
        int secondNumber = input.nextInt();

//Zdania logiczne z wprowadzonymi wcześniej wartościami
        boolean firstValue = firstNumber == secondNumber;
        boolean secondValue = firstNumber <= secondNumber;
        boolean thirdValue = firstNumber >= secondNumber;
        boolean fourthValue = firstNumber != secondNumber;

        //&& -> AND
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && thirdValue);
        System.out.println(secondValue && fourthValue);
        //|| -> OR
        System.out.println(firstValue || secondValue);
        System.out.println(firstValue || thirdValue);
        System.out.println(secondValue || fourthValue);
        //! -> Negation
        System.out.println(!firstValue);
        System.out.println(!secondValue);
        System.out.println(!(firstValue && secondValue));
    }
}
