import java.util.*;
public class binarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the element to be searched: ");
        int e = sc.nextInt();
        boolean flag = false;
        int low=0, high=n-1, mid=n/2;
        while(low<high) {
            int d=a[mid];
            if (e > d)
                low = mid + 1;
            else if (e < d)
                high = mid- 1;
            else if (e == d) {
                flag = true;
                break;
            }
            mid=(high+low)/2;
        }
        if (flag == true)
            System.out.print("Element found");
        else
            System.out.print("Element not found");
    }
}
