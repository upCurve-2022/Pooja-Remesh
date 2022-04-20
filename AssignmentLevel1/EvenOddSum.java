import java.util.*;
public class EvenOddSum {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int n=sc.nextInt();
        int esum=0,osum=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
                esum=esum+i;
            else
                osum=osum+i;
        }
        System.out.println("Even sum = "+esum+"\nOdd sum = "+osum);
    }
}
