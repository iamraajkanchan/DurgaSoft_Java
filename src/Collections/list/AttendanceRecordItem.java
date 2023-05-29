package Collections.list;

import com.google.gson.annotations.SerializedName;

public class AttendanceRecordItem{

	@SerializedName("image")
	private String image;

	@SerializedName("checkIn")
	private String checkIn;

	@SerializedName("address")
	private String address;

	@SerializedName("lunchOut")
	private String lunchOut;

	@SerializedName("LONGITUDE")
	private String lONGITUDE;

	@SerializedName("dates")
	private String dates;

	@SerializedName("lunchIn")
	private String lunchIn;

	@SerializedName("checkOut")
	private String checkOut;

	@SerializedName("LATITUDE")
	private String lATITUDE;

	@SerializedName("ATTENDANCE_ID")
	private String aTTENDANCEID;

	public String getImage(){
		return image;
	}

	public String getCheckIn(){
		return checkIn;
	}

	public String getAddress(){
		return address;
	}

	public String getLunchOut(){
		return lunchOut;
	}

	public String getLONGITUDE(){
		return lONGITUDE;
	}

	public String getDates(){
		return dates;
	}

	public String getLunchIn(){
		return lunchIn;
	}

	public String getCheckOut(){
		return checkOut;
	}

	public String getLATITUDE(){
		return lATITUDE;
	}

	public String getATTENDANCEID(){
		return aTTENDANCEID;
	}
}