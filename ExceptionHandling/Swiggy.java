import java.util.*;
public class Swiggy extends locationException{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter zip code: ");
        String zip = sc.nextLine();
        try{
            if(zip.equals("123")||zip.equals("456")||zip.equals("789")) {
                throw new locationException("Delivery is not available in your area!");
            }
            else{
                System.out.println("Delivery available in your area! ");
            }
        }
        catch(locationException e){
            System.out.println("Delivery is not  available in your area!");
        }
    }
}

