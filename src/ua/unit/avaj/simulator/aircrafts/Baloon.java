package ua.unit.avaj.simulator.aircrafts;

import ua.unit.avaj.simulator.WeatherTower;
import ua.unit.avaj.weather.Coordinates;

public class Baloon extends Aircraft {

	private WeatherTower weatherTower;

	Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	@Override
	public void updateConditions() {

	}

	@Override
	public void registerTower(WeatherTower weatherTower) {

	}
}
