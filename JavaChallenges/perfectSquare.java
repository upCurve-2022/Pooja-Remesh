import java.util.*;
public class perfectSquare {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n=sc.nextDouble();
        double s= Math.sqrt(n);
        if((s-Math.floor(s))==0)
        {
            System.out.println("Perfect Square");
        }
        else
        {
            System.out.println("Not a Perfect Square");
        }
    }
}
