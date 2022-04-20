import java.util.*;
public class Sequence22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit:");
        int n = sc.nextInt();
        int a = 1, b = 1, c, i = 2;
        System.out.print(a + "," + b);
        while (i < n) {
            c = a + b;
            System.out.print(","+c);
            a = b;
            b = c;
            i++;
        }
    }
}
