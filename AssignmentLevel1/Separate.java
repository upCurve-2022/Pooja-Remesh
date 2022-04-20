import java.util.*;
public class Separate {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a=sc.nextDouble();
        int b= (int) a;
        double c= a - b;
        c=c*100;
        int k = (int) c;
        System.out.println(b+" "+k);

    }
}
