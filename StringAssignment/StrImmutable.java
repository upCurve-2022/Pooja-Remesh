import java.util.*;
public class StrImmutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str1 = sc.nextLine();
        System.out.println(str1.hashCode());
        System.out.print("Enter the string to concat : ");
        String str2 = sc.nextLine();
                str1 = str1+str2;
        System.out.println("After concatenation: "+str1);
        System.out.println(str1.hashCode());
        System.out.println("Immutable since hashcode changed");
    }
}
