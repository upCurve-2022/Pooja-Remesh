import java.util.*;
public class Largest {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int largest=0;
        int second=0;
        System.out.print("Enter 3 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c){
            largest=a;
            if(b>c)
                second=b;
            else
                second=c;
        }
        else if(b>=a && b>=c){
            largest=b;
            if(a>c)
                second=a;
            else
                second=c;
        }
        else if (c>=a && c>=b){
            largest=c;
            if(a>b)
                second=a;
            else
                second=b;
        }
        System.out.println("Largest is "+largest);
        System.out.println("Second Largest is "+second);
    }
}
