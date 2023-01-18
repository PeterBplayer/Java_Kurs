//Metoda -  blok, który zawiera jakieś instrukcje. Może być uruchomiona (wywołana) poprzez odwołanie się do jej nazwy()
public class Metody {
    //    public - identyfikator dostępu
//    void - typ(np. int, String, Student, void) w tym przypadku nasza metoda nie zwraca żadnej konkretnej wartości
//    nazwa metody -  konwencja camelCase
    public void pobierzWynik() {
        System.out.println("Zaraz pobiorę wynik...");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);
    }

    public int policzWynik() {
        System.out.println("Zaraz policzę wynik...");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);
        return result;
    }

    public void pobierzWynikParam(int number) {
        System.out.println("Number ma wartość: " + number);
        System.out.println("Zaraz pobiorę wynik...");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);
    }

    public int add(int firstNumber, int secondNumber) {
        System.out.println("Suma to: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }
}
