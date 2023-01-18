package Podstawy;

import java.util.Scanner;

// Można zastąpić dzięki tej funkcji instrukcję Else if
public class Switch {
    public static void main(String[] args) {
        Scanner mealInput = new Scanner(System.in);
        System.out.println("Please type what would you like to eat:");
        String meal = mealInput.next();

        switch (meal) {
            case "Pizza", "pizza" -> System.out.println("Price is 7$");
            case "Hot-dog", "hot-dog", "Hotdog", "hotdog" -> System.out.println("Price is 4$");
            case "Fries", "fries", "French fries", "french fries" -> System.out.println("Price is 2$");
            default -> System.out.println("The is no such meal.");
        }
    }
}
