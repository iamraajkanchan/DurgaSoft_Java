package Collections.lists;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class ListWithPojo {
    public static void main(String... args) {
        /* Use this technique when you receive a list from response rather than object. */
        getDataFromList();
        /* Use this technique when you receive an object from response rather than list. */
        // getDataFromClass();
    }

    public static void getDataFromList() {
        try {
            TypeToken<List<AttendanceRecordItem>> token = new TypeToken<>() {
            };
            List<AttendanceRecordItem> attendances = new Gson().fromJson(AttendanceData.ATTENDANCE_DATA, token);
            for (AttendanceRecordItem attendance : attendances) {
                System.out.println(attendance.getAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getDataFromClass() {
        try {
            TypeToken<AttendanceRecord> token = new TypeToken<>() {
            };
            AttendanceRecord attendances = new Gson().fromJson(AttendanceData.ATTENDANCE_DATA, token);
            for (AttendanceRecordItem attendance : attendances.getAttendanceRecord()) {
                System.out.println(attendance.getAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
