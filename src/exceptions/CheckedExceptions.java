package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void readFile (String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }

    public static void main(String[] args) {
        try { // blok kodu który może wyrzucić wyjątek, w tym przypadku w momencie gdy system nie będzie mógł znaleźć pliku
            System.out.println("Before reading file");
            readFile("C:\\Users\\piotr.keppel\\IdeaProjects\\Java_Kurs\\src\\exceptions\\test.txt");
        } catch (FileNotFoundException e) { // blok obsługi złapanego wyjątku
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        } finally { // blok wykonuje się zawsze, gdy kod w bloku try działa poprawnie,
            // jak również w momencie złapania oczekiwanego wyjątku, który zostanie wyrzucony
            System.out.println("Closing file");
        }
    }

}
