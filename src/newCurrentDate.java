import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class newCurrentDate {

    public static void main(String[] args) {
        // prints put current date and time without format
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        // hours,minutes,seconds
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("Time: " + currentDateTime.format(timeFormatter));

        //day month(full) year format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println("Date: " + currentDateTime.format(dateFormatter));

        // day of the week
        DateTimeFormatter dayOfWeekFormatter = DateTimeFormatter.ofPattern("EEEE");
        System.out.println("Day of the week: " + currentDateTime.format(dayOfWeekFormatter));

        DateTimeFormatter clockFormatter = DateTimeFormatter.ofPattern("h:mm a");
        System.out.println("12 hour format " + currentDateTime.format(clockFormatter));
    }
}
