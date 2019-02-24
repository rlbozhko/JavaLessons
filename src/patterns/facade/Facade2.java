package patterns.facade;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Facade2 {

    public static void convertDate(String format, String timezone) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        ZoneId zoneId = ZoneId.of(timezone);

        LocalDateTime now = LocalDateTime.now(zoneId);

        System.out.println(now.format(formatter));
    }

    public static void main(String[] args) {
        convertDate("d::MMM::uuuu HH::mm::ss", "US/Samoa");
    }
}

