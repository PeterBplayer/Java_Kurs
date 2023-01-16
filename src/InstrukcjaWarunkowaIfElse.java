import java.util.Scanner;

//Instrukcja warunkowa "if else" pozwala nam określić, które części kodu mają zostać wykonane, gdy zostanie spełniony warunek
//oraz co ma się wykonać gdy ten warunek nie zostanie spełniony
public class InstrukcjaWarunkowaIfElse {
    public static void main(String[] args) {
        //Wprowadzenie dwóch liczb z klawiatury
        Scanner input = new Scanner(System.in);
        System.out.println("Please type first number and press Enter.");
        float a = input.nextFloat();
        System.out.println("Please type first number and press Enter.");
        float b = input.nextFloat();

        //Instrukcja warunkowa "If/Else"
        if (b != 0) {
            System.out.println("Division result: " + (a / b));
        } else {
            System.out.println("Next time please type number different than ZERO!");
        }
    }


}
