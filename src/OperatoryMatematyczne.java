//Umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int mod = secondNumber % firstNumber; //4 mieści się w 6 jeden raz, a reszta z dzielenia wychodzi 2

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Modulo(reszta z dzielenia): " + mod);

        firstNumber += secondNumber; //firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber -= secondNumber; //firstNumber = firstNumber - secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber);
        firstNumber *= secondNumber; //firstNumber = firstNumber * secondNumber
        System.out.println("Po mnożeniue: " + firstNumber);
        firstNumber /= secondNumber; //firstNumber = thirdNumber / secondNumber
        System.out.println("Po dzieleniu: " + thirdNumber);
        firstNumber %= secondNumber; //firstNumber = firstNumber % secondNumber
        System.out.println("Po modulo: " + firstNumber);

    }
}
