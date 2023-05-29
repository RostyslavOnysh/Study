package MateAcademy.CodeWars;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.ZoneId;

public class CountTheDays {
    public String countDays(Date d) {
        LocalDateTime date = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        /*
        convert the Date object to LocalDateTime.
        This allows us to obtain the date and time from the Date object.
         */
        Duration duration = Duration.between(LocalDateTime.now(), date);
        /*
        I use the between method of the Duration class to calculate the difference between
        the current time (LocalDateTime.now())
         and the input date (date). The resulting difference is stored in the duration object.
         */
        long days = duration.toDays();
        /*
         call the toDays() method on the duration object to obtain the number of days
         in the time difference.
         */
        return (days == 0) ? "Today is the day!" : (days < 0) ? "The day is in the past!" : days + " days";
        /*
         use the ternary operator to return the appropriate string based on the value of days.
         */
    }
}