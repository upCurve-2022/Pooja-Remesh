import java.util.*;
public class Average {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int i;
        double sum=0;
        int[] a=new int[n];
        System.out.print("Enter the array elements: ");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
            sum=a[i]+sum;
        double avg=sum/n;
        System.out.println("The average: "+avg);
    }

}
