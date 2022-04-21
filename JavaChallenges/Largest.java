import java.util.*;
public class Largest {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number: "+d);
    }
}
