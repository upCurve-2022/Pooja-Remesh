import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String arg[]) {
        try {
            File myFile = new File("newfile.txt");

            if (myFile.createNewFile())
                System.out.println("File created: " + myFile.getName());
            else
                System.out.println("File already exists.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
