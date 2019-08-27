package ua.unit.avaj.weather;

public class Coordinates {

	private int		longitude, latitude, height;

	Coordinates (int lon, int lat, int hgh) {
		longitude = lon;
		latitude = lat;
		height = hgh;
	}

	public int getLongitude() {
		return longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public int getHeight() {
		return height;
	}
}
