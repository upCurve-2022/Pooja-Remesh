import java.io.FileOutputStream;
public class WriteFile {
    public static void main(String arg[]) {
        try {
            FileOutputStream myfile=new FileOutputStream("E:\\Target\\JavaChallenges\\Q9\\text.txt");
            myfile.write(76);
            myfile.close();
        } catch ( Exception e) {
            System.out.print("An error had occurred");
        }
    }
}
