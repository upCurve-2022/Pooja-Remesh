import java.time.LocalTime;
import java.time.LocalDate;
public class timeDate {
    public static void main(String srg[]){
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println("Time: "+time);
        System.out.print("Date: "+date);
    }
}
