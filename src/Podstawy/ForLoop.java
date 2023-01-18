package Podstawy;

import java.util.Scanner;

//Umożliwia cykliczne wykonywanie ciągu instrukcji określoną liczbę razy.
public class ForLoop {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = inputNumber.nextInt();

       /* for (int i = 0; i <= number; i = i + 2) {
            System.out.println(i);
        }*/

        //Wypisanie liczb podzielnych przez 5
        for (int i = 0; i < number; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
