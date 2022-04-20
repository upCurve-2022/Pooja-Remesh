import java.util.*;
public class Reverse {
    public static void main(String arg[]){
        int rev=0,d;
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        System.out.println("Reverse Number: "+rev);
    }
}
