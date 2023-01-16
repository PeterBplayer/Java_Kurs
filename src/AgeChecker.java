import java.util.Scanner;

/*Zapytaj użytkownika o wiek.
W przypadku gdy ma mniej niż 18 lat to wypisz na ekranie informację, że nie może kupić alkoholu.
Gdy ma więcej niż 18 lat to podziękuj za zakupy.*/
public class AgeChecker {
    public static void main(String[] args) {
//        Wprowadzenie wieku z klawiatury
        Scanner ageInput = new Scanner(System.in);
        System.out.println("Please type your age:");
        int age = ageInput.nextInt();
//        Sprawdzenie wieku użytkownika
        if (age >= 18) System.out.println("Thank you for shopping.");
        else if (age < 0) System.out.println("Don't be a smart ass...");
        else System.out.println("You cannot buy any alcohol under age 18!");
    }
}
