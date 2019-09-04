package ua.unit.avaj.aircrafts;

import ua.unit.avaj.WeatherTower;

public class Helicopter extends Aircraft {

	private WeatherTower weatherTower;

	Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
		this.type = "Helicopter";
	}

	@Override
	public void updateConditions() {

	}

	@Override
	public void registerTower(WeatherTower weatherTower) {

	}

}
