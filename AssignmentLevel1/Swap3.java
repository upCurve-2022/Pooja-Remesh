import java.util.*;
public class Swap3 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b=sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int c=sc.nextInt();
        System.out.println("Initial values");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        a = a + b + c; //total
        b = a - (b + c); //value of a in b
        c = a - (b + c); //value of b in c
        a = a - (b + c); //value of c in a
        System.out.println("Swapped values");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

    }
}
