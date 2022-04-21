import java.util.*;
public class Concat {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string: ");
        String str1=sc.nextLine();
        System.out.print("Enter the 2nd string: ");
        String str2=sc.nextLine();
        System.out.print("Concatenated String: "+str1.concat(str2));
    }
}
