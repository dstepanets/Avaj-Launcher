package ua.unit.avaj.weather;

import java.util.Random;

public class WeatherProvider {

	static private WeatherProvider	weatherProvider;
	static private final String[]	weather = { "RAIN", "FOG", "SUN", "SNOW" };

	private WeatherProvider() {}

	static public WeatherProvider getProvider() {
		if (weatherProvider == null) {
			weatherProvider = new WeatherProvider();
		}
		return weatherProvider;
	}

	public String getCurrentWeather(Coordinates coordinates) {

		int seed = coordinates.getLongitude() + coordinates.getLatitude() + coordinates.getHeight();
		seed += new Random().nextInt(100);

		return (weather[seed % 4]);
	}
}
