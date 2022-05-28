import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class numberOfDays {
    public static void main(String[] args) {
        
        //24-May-2017, change this to your desired Start Date
        LocalDate dateBefore = LocalDate.of(2021, Month.OCTOBER, 20);
        //29-July-2017, change this to your desired End Date
        LocalDate dateAfter = LocalDate.of(2022, Month.FEBRUARY, 14);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);
        
    }
   
    
}