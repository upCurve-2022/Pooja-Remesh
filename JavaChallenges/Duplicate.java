import java.util.*;
public class Duplicate {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1=sc.nextLine();
        int count;
        char string[] = str1.toCharArray();
        System.out.println("Duplicate characters in the given string: ");
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }
            if(count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
}
