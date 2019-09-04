package ua.unit.avaj.aircrafts;

public class Coordinates {

	private int		longitude, latitude, height;

	Coordinates(int longitude, int latitude, int height) {

		this.longitude = (longitude < 0) ? 0 : longitude;
		this.latitude = (latitude < 0) ? 0 : latitude;

		if (height > 100)
			height = 100;
		else if (height < 0)
			height = 0;
		this.height = height;

	}

	public int getLongitude() {
		return this.longitude;
	}
	public int getLatitude() {
		return this.latitude;
	}
	public int getHeight() {
		return this.height;
	}
}
