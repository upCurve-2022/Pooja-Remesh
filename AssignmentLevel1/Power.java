import java.util.*;
public class Power {
    public static int pow(int x,int n){
        int result = 1;
        while(n!=0) {
            result =result * x;
            n--;
        }
        return result;
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X:");
        int x = sc.nextInt();
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print(pow(x, n));
    }
}
