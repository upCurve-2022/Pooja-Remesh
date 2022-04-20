import java.util.*;
public class Sequence23 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        a[0] = 1;
        a[1] = -2;
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0)
                a[i] = a[i - 2] + 3;
            else
                a[i] = a[i - 2] - 4;
        }
        for (int i = 0; i < n; i++){
            if(i==0)
                System.out.print(a[i]);
            else
                System.out.print(","+a[i]);
        }
    }
}
