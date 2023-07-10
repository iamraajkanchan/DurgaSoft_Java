package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExamples {
    public static void main(String... args) {
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yy", Locale.ENGLISH);

        Calendar fromCalendar = Calendar.getInstance();
        fromCalendar.add(Calendar.DAY_OF_YEAR, -15);
        String fromCalendarString = sf.format(fromCalendar.getTime());
        System.out.println("From Date: " + fromCalendarString);

        String toCalendarString = sf.format(Calendar.getInstance().getTime());
        System.out.println("To Date: " + toCalendarString);

        System.out.println("Attendance ID " + getAttendanceId());
        System.out.println("Attendance ID Length " + getAttendanceId().length());
    }

    private static String getAttendanceId() {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss", Locale.ENGLISH);
        String dateString = sdf.format(Calendar.getInstance().getTime());
        return "7718881920" + dateString;
    }
}
