import java.util.*;
public class RemoveHyphen {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        for(int i=1; i<str.length()-1; i++){
            if(!(str.charAt(i) == '-' && str.charAt(i-1) >= '0' && str.charAt(i-1) <= '9' && str.charAt(i+1) >= '0' && str.charAt(i+1) <= '9')){
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(str.charAt(str.length() - 1));
    }
}
