import java.time.*;

public class UseOfPeriodTwo {
    public static void main(String...args){
        LocalDate date = LocalDate.of(2015, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);        

        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        System.out.println(time.plus(period));
    }
}
