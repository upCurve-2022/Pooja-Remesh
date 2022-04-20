import java.util.*;
public class Sequence21 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int n = sc.nextInt();
        int val = 1;
        for (int i = 1; i < n; i++) {
            val = val + (i - 1) * (i - 1);
            if (i % 2 == 0)
                System.out.print("-"+val+" ");
            else
                System.out.print(val+" ");
        }
    }
}
