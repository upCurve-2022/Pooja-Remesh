import java.util.*;
public class DecToBin {
    public static void main(String arg[]){
        int index=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNum=sc.nextInt();
        int[] binaryNum=new int[20];
        while(decimalNum>0){
            binaryNum[index]=decimalNum%2;
            index++;
            decimalNum=decimalNum/2;
        }
        System.out.print("Binary Number: ");
        for(int i=index-1;i>=0;i--){
            System.out.print(binaryNum[i]);
        }
    }
}
