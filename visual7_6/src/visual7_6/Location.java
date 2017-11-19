package visual7_6;

public class Location {
	static int latitude;
	static int longitude;
	
	public Location(int lati, int longi) {
		this.latitude = lati;
		this.longitude = longi;
	}
	public int getLatitude() {
		return latitude;
	}
	public int getLongitude() {
		return longitude;
	}
}
