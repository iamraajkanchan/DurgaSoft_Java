package hackerRank.timeConversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Result {
    public static String timeConversion(String s) throws ParseException {
        // Write your code here
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssa");
        Date enteredDate = sdf.parse(s);
        return new SimpleDateFormat("HH:mm:ss").format(enteredDate);
    }
}
