import java.util.Scanner;

//Instrukcja warunkowa "if" pozwala nam określić, które części kodu mają zostać wykonane, gdy zostanie spełniony warunek
public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        //Wprowadzenie dwóch liczb z klawiatury
        Scanner input = new Scanner(System.in);
        System.out.println("Please type first number and press Enter.");
        float a = input.nextFloat();
        System.out.println("Please type second number and press Enter.");
        float b = input.nextFloat();
        //Instrukcja warunkowa "If"
        if (b != 0) {
            System.out.println("Division result: " + (a / b));
        }
    }
}
