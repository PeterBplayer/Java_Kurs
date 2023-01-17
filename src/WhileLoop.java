// Petla while - najpierw sprawdzany jest warunek (tutaj zmienna ma być mniejsza niż 20),
// następnie wykonywana jest instrukcja w bloku while: wypisywany jest kod i przypisanie wartości zmiennej o +1.
public class WhileLoop {
    public static void main(String[] args) {
        int number = 0;
        while (number < 20) {
            System.out.println("Number value is " + number + " and it is less than 20.");
            number++;
        }
    }
}
