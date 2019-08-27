package ua.unit.avaj.simulator.aircrafts;

import ua.unit.avaj.simulator.WeatherTower;
import ua.unit.avaj.weather.Coordinates;

public class Helicopter extends Aircraft {

	private WeatherTower weatherTower;

	Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	@Override
	public void updateConditions() {

	}

	@Override
	public void registerTower(WeatherTower weatherTower) {

	}

}
