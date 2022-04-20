import java.util.*;
public class StrRev {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.next();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //to get each character
            rev = ch + rev;
        }
        System.out.println(rev);
    }

}
