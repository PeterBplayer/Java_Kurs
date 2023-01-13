import java.util.Scanner;

public class CustomScanner {

    /* public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please type your name and press Enter.");
         String name = scanner.nextLine();
         System.out.println("Hello " + name + "!");
     }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type first number and press Enter.");
        int firstNumber = scanner.nextInt();
        System.out.println("Square root of this number is: " + firstNumber * firstNumber);
    }
}
