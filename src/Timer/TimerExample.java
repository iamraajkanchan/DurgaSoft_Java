package Timer;

import java.util.Calendar;

public class TimerExample {
    public static void main(String[] a) {
        Calendar startTimeCalendar = Calendar.getInstance();
        startTimeCalendar.set(Calendar.HOUR_OF_DAY, 10);
        startTimeCalendar.set(Calendar.MINUTE, 0);
        startTimeCalendar.set(Calendar.SECOND, 0);
        System.out.println(startTimeCalendar.getTime());

        Calendar endTimeCalendar = Calendar.getInstance();
        endTimeCalendar.set(Calendar.HOUR_OF_DAY, 19);
        endTimeCalendar.set(Calendar.MINUTE, 0);
        endTimeCalendar.set(Calendar.SECOND, 0);
        System.out.println(endTimeCalendar.getTime());
    }
}
