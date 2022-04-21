import java.util.*;
public class Remove {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.print("Enter the character to be removed: ");
        char c =sc.nextLine().charAt(0);
        int n =str.length();
        String s="";
        for (int i= 0; i < n; i++)
        {
            if (str.charAt(i) != c)
                s = s + str.charAt(i);
        }
        System.out.println(s);
    }

}
