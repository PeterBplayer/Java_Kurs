package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\piotr.keppel\\IdeaProjects\\Java_Kurs\\src\\files\\file.txt");
        writer.write("Example text in file. Next example");
        writer.close();
    }
}
