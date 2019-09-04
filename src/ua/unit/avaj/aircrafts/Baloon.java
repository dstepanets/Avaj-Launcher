package ua.unit.avaj.aircrafts;

import ua.unit.avaj.WeatherTower;

public class Baloon extends Aircraft {

	private WeatherTower weatherTower;

	Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
		this.type = "Baloon";
	}

	@Override
	public void updateConditions() {

	}

	@Override
	public void registerTower(WeatherTower weatherTower) {

	}
}
