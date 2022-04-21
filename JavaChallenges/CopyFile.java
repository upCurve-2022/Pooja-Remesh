import java.io.*;
import java.util.*;
public class CopyFile {
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source file name :");
        String sfile = sc.next();
        System.out.print("Enter the destination file name :");
        String dfile = sc.next();
        FileReader filein = new FileReader(sfile);
        FileWriter fileout = new FileWriter(dfile, true);
        int c;
        while ((c = filein.read()) != -1) {
            fileout.write(c);
        }
        System.out.println("Data is copied successfully");
        filein.close();
        fileout.close();
    }
}
