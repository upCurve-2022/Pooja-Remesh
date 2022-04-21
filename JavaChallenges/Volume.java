import java.util.*;
public class Volume {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int radius,height;
        System.out.print("Enter the radius: ");
        radius = sc.nextInt();
        System.out.print("Enter the height: ");
        height = sc.nextInt();
        double V= (3.14)*(radius*radius*height);
        System.out.print("Volume: "+V);
    }
}
