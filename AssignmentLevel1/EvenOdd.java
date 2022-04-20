import java.util.*;
public class EvenOdd {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("The number "+n+" is even");
        else
            System.out.println("The number "+n+" is odd");

    }
}
