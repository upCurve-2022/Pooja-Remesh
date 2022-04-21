import java.util.*;
public class CheckUglyNum {
    public static void main(String arg[]) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        while(n!=1) {
            if(n%5==0)
                n=n/5;
            else if(n%3==0)
                n=n/3;
            else if(n%2==0)
                n=n/2;
            else
            {
                System.out.println("Not an Ugly Number.");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Ugly Number.");
    }

}
