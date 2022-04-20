import java.util.*;
public class Armstrong {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int sum=0,num=n;
        while(num>0){
            int d=num%10;
            sum+=d*d*d;
            num/=10;
        }
        if(n==sum)
            System.out.println(n+" is an Armstrong Number");
        else
            System.out.println(n+" is not an Armstrong Number");
    }
}
