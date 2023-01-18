package Podstawy;

// Pętla do while - najpierw wykonywana jest instrukcja w bloku do, a następnie sprawdzany jest warunek
public class DoWhileLoop {
    public static void main(String[] args) {
        int number = 5;
        do {
            System.out.println("Number value is " + number + " and it is less than 20.");
            number++;
        }
        while (number < 20);
    }
}
