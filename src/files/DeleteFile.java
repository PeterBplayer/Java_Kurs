package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("src/files/file.txt");
        if (file.delete()) {
            System.out.println("File was deleted");
        } else {
            System.out.println("Error! There is no such file.");
        }
    }
}
