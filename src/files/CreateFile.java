package files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\piotr.keppel\\IdeaProjects\\Java_Kurs\\src\\files\\file.txt");
        if (file.createNewFile()) {
            System.out.println("Stworzyłem nowy plik.");
        } else {
            System.out.println("PLik już istnieje.");
        }
    }
}
