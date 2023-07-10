package timer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateExample {
    public static void main(String... args) {
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yy", Locale.ENGLISH);
        Calendar fromCalendar = Calendar.getInstance();
        fromCalendar.add(Calendar.DAY_OF_YEAR, -6);
        String fromDate = sf.format(fromCalendar.getTime());
        System.out.println("From Date: " + fromDate);
        Calendar toCalendar = Calendar.getInstance();
        String toDate = sf.format(toCalendar.getTime());
        System.out.println("To Date: " + toDate);
        System.out.println("===============================");
        System.out.println("2 hours to Milliseconds.");
        System.out.println(TimeUnit.HOURS.toMillis(2));
        setEnrollmentDate();
        System.out.println("===============================");
        System.out.println("Extracting Time From Response.");
        System.out.println(extractTimeFromResponse("2023-05-18 17:52:06.072"));
        System.out.println("===============================");
        System.out.println("Extracting Day From Response.");
        System.out.println(extractDayFromResponse("2023-05-18 17:52:06.072"));;
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

    public static void setEnrollmentDate() {
        String endDate = new SimpleDateFormat("dd-MM-yy").format(new Date());
        String pattern = "dd-MM-yy";
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Date dates = simpleDateFormat.parse(endDate);
            String date = new SimpleDateFormat("MMMM d, yyyy").format(dates);
            System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String extractTimeFromResponse(String dateString) {
        String currentDate = "";
        if (dateString != "") {
            try {
                Date date = new SimpleDateFormat("yy-MM-dd hh:mm:ss.SSS", Locale.ENGLISH).parse(dateString);
                SimpleDateFormat curr = new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
                if (date != null) {
                    currentDate = curr.format(date.getTime());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return currentDate;
    }

    public static String extractDayFromResponse(String dateString) {
        String currentDate = "";
        if (dateString != "") {
            try {
                Date date = new SimpleDateFormat("yy-MM-dd hh:mm:ss.SSS", Locale.ENGLISH).parse(dateString);
                SimpleDateFormat curr = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
                if (date != null) {
                    currentDate = curr.format(date.getTime());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return currentDate;
    }
}
