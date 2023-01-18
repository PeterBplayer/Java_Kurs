package Podstawy;

import java.util.Scanner;

//Instrukcja warunkowa "if elseif else" pozwala sprawdzić wiele warunków które ma wykonać program w momencie ich spełnienia
public class InstrukcjaWarunkowaIfElseIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type number and press Enter.");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Number greater than zero");
        } else if (number < -10) {
            System.out.println("Number lesser than -10");
        } else if (number == 0) {
            System.out.println("Number equals zero");
        } else {
            System.out.println("Number between -10 and zero");
        }
    }
}
