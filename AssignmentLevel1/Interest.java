import java.util.*;
public class Interest {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        double interest;
        System.out.print("Enter the principle amount: ");
        float p=sc.nextFloat();
        System.out.print("Enter the time in years: ");
        float t=sc.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float r=sc.nextFloat();
        interest=(p*t*r)/100;
        System.out.println("Interest: "+interest);

    }
}
