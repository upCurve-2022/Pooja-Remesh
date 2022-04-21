import java.util.*;
public class UpperCase {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.nextLine();
        String upper=str.toUpperCase();
        System.out.print("String in Uppercase :");
        System.out.print(upper);
    }
}
