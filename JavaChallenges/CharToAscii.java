import java.util.*;
public class CharToAscii {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        int a = c;
        System.out.println("The ASCII value of " + c + " is: " + a);
    }
}
