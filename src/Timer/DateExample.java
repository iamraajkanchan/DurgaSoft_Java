package Timer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String... args) {
        Calendar startCalendar = Calendar.getInstance();
        System.out.println("Start Calendar : " + startCalendar.getTime());
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.add(Calendar.DAY_OF_YEAR, -7);
        System.out.println("End Calendar : " + endCalendar.getTime());
    }

    public static void getLastDate() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate currentDate = LocalDate.now();
        String seventhDate = currentDate.minusDays(7).format(df);
        System.out.println("Current Date : " + currentDate);
        System.out.println("Seventh Date : " + seventhDate);

    }

    /**
     * href - https://stackoverflow.com/questions/17210839/get-last-week-date-range-for-a-date-in-java
     */
    public static void getLastDateRange() {
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        Date start = c.getTime();
        int i = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();
        c.set(Calendar.DATE, -i - 1);
        // c.add(Calendar.DATE, 6);
        Date end = c.getTime();
        System.out.println(start + " - " + end);
    }

    public static String getCalculatedDate() {
        Calendar cal = Calendar.getInstance();
        //
        /*
        cal.add(Calendar.DATE, 2);
        System.out.println("getCalculatedDate :: " + cal.getTime());
        */
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        cal.add(Calendar.DAY_OF_YEAR, -7);
        return s.format(new Date(cal.getTimeInMillis()));
    }
}
