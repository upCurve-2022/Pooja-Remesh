import java.util.*;
public class linearSearch {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the element to be searched: ");
        int e = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == e) {
                flag = true;
                break;
            }
        }
        if (flag==true)
            System.out.print("Element found");
        else
            System.out.print("Element not found");
    }
}
