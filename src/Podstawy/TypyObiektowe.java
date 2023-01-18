package Podstawy;

//Przechowują aktualną wartość oraz umożliwiają wykonanie akcji (wywołanie metod) na tych danych
public class TypyObiektowe {
    public static void main(String[] args) {

        //Liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt -127 do 127
        Short secondNumber = 32689; // 2 bajty -32.768 do 32.767
        Integer thirdNumber = 32768999; // 4 bajty - 2.147.483.648 do 2.147.483.647
        Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

        //Liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // 4 bajty - max ok. 6-7 cyfr po przecinku
        Double sixthNumber = 3.99999999999999D; // 8 bajtów - max ok. 15 cyfr po przecinku

        //Wartości logiczne
        Boolean prawda = true;
        Boolean falsz = false;

        //Pojedynczy znak
        Character letter= 'A';

        //Ciąg znaków
        String hello = "Hello!";

        System.out.println(hello.charAt(0));

    }
}
