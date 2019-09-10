package ua.unit.avaj.aircrafts;

import ua.unit.avaj.Logger;
import ua.unit.avaj.WeatherTower;

import java.util.HashMap;

public class JetPlane extends Aircraft implements Flyable {

	private WeatherTower weatherTower;

	JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
		this.type = "JetPlane";
	}

	public void updateConditions() {

		HashMap<String, String> reports = new HashMap<>();
		reports.put("SUN", "Jesus! My ice cream is melting!");
		reports.put("RAIN", "F**KING S**T! Popcorn is wet!");
		reports.put("FOG", "Can't see a damn thing in this fog. Good time for a coffee break!");
		reports.put("SNOW", "Goddammit! Pizza is cold. Tower, I'm going back for a new one.");

		String weather = this.weatherTower.getWeather(this.coordinates);
		if (weather.equals("SUN")) {
			this.coordinates = new Coordinates(
					this.coordinates.getLongitude(),
					this.coordinates.getLatitude() + 10,
					this.coordinates.getHeight() + 2);
		}
		else if (weather.equals("RAIN")) {
			this.coordinates = new Coordinates(
					this.coordinates.getLongitude(),
					this.coordinates.getLatitude() + 5,
					this.coordinates.getHeight());
		}
		else if (weather.equals("FOG")) {
			this.coordinates = new Coordinates(
					this.coordinates.getLongitude(),
					this.coordinates.getLatitude() + 1,
					this.coordinates.getHeight());
		}
		else if (weather.equals("SNOW")) {
			this.coordinates = new Coordinates(
					this.coordinates.getLongitude(),
					this.coordinates.getLatitude(),
					this.coordinates.getHeight() - 7);
		}

		Logger.logLine(this.getFullId() + ": " + reports.get(weather));

		if (this.coordinates.getHeight() == 0) {
			Logger.logLine(this.getFullId() + ": Landing... Coordinates: " + this.coordinates.getCoordinates());
			this.weatherTower.unregister(this);
		}
	}

	public void registerTower(WeatherTower tower) {
		this.weatherTower = tower;
		this.weatherTower.register(this);
	}

}
