import java.util.*;
public class Swap2 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b=sc.nextInt();
        System.out.println("The numbers are a= "+a+" and b= "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Values after swapping");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
