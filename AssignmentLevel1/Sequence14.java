import java.util.*;
public class Sequence14 {
    public static void main(String arg[]){
        int first,second,third,next;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit= sc.nextInt();
        first=1;
        second=4;
        third=7;
        for(int i=4;i<=limit;i++){
            if(i==4)
                System.out.print(first+","+second+","+third);
            next=first+second+third;
            System.out.print(","+next);
            first=second;
            second=third;
            third=next;
        }
    }
}
