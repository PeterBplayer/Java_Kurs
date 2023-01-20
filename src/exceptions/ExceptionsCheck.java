//Pobierz wiek od użytkownika, jeżeli będzie mniejszy od zera to wyrzuć wyjątek InvalidAgeException
package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {
    public static void main(String[] args) throws InvalidAgeException {

        Scanner ageInput = new Scanner(System.in);
        System.out.println("Please type your age:");
        int age = ageInput.nextInt();

        if (age >= 18) {
            System.out.println("Thank you for shopping.");
        } else if (age >= 0) {
            System.out.println("You cannot buy any alcohol under age 18!");
        } else {
            throw new InvalidAgeException("Age cannot be less than zero");
        }

    }
}
