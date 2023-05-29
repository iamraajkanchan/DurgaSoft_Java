package Collections.list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AttendanceRecord{

	@SerializedName("AttendanceRecord")
	private List<AttendanceRecordItem> attendanceRecord;

	public List<AttendanceRecordItem> getAttendanceRecord(){
		return attendanceRecord;
	}
}