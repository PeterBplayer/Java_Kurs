//Zawierają tylko "surowe dane"
public class TypyProste {
    //Liczby stałoprzecinkowe
    byte firstNumber = 127; // 1 bajt -127 do 127
    short secondNumber = 32689; // 2 bajty -32.768 do 32.767
    int thirdNumber = 32768999; // 4 bajty - 2.147.483.648 do 2.147.483.647
    long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

    //Liczby zmiennoprzecinkowe
    float fifthNumber = 4.99934F; // 4 bajty - max ok. 6-7 cyfr po przecinku
    double sixthNumber = 3.99999999999999D; // 8 bajtów - max ok. 15 cyfr po przecinku

    //Wartości logiczne
    boolean prawda = true;
    boolean falsz = false;

    //Pojedynczy znak
    char letter = 'A';
}
