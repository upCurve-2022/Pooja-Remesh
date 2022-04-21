import java.util.*;
public class CheckStr {
    public static boolean is_str_contains(String str1, String str2) {
        boolean ans = false;
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                for (int j = 0; j < str2.length(); j++) {
                    if ((i + j) < str1.length() && str2.charAt(j) == str1.charAt(i + j) && j == str2.length() - 1) {
                        ans = true;
                        break;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        if(is_str_contains(str1, str2))
            System.out.println("The first string contains the second one");
        else
            System.out.println("The first string does not contain the second one");
    }
}
