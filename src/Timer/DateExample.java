package Timer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateExample {
    public static void main(String... args) {
        Calendar startCalendar = Calendar.getInstance();
        System.out.println("Start Calendar : " + startCalendar.getTime());
        Calendar endCalendar = Calendar.getInstance();
        int dayFromMonday = (endCalendar.get(Calendar.DAY_OF_WEEK) + 7 - Calendar.MONDAY) % 7;
        endCalendar.set(Calendar.DATE, -dayFromMonday -1);
        System.out.println("End Calendar : " + endCalendar.getTime());
        getLastDate();
    }

    public static void getLastDate() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate currentDate = LocalDate.now();
        String seventhDate = currentDate.minusDays(7).format(df);
        System.out.println("Current Date : " + currentDate);
        System.out.println("Seventh Date : " + seventhDate);
    }
}
