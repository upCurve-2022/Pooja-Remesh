import java.util.*;
public class StrCompare {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter another String : ");
        String str2 = sc.nextLine();
        System.out.println(str1.compareTo(str2));
    }
}
