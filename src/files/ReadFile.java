package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/files/file.txt");
        Scanner myReader = new Scanner(file);
        while (myReader.hasNext()) {
            String line = myReader.nextLine();
            System.out.println(line);
        }
        myReader.close();
    }
}
