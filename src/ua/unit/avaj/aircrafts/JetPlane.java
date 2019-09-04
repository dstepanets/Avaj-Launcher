package ua.unit.avaj.aircrafts;

import ua.unit.avaj.WeatherTower;

public class JetPlane extends Aircraft {

	private WeatherTower weatherTower;

	JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
		this.type = "JetPlane";
	}

	@Override
	public void updateConditions() {

	}

	@Override
	public void registerTower(WeatherTower weatherTower) {

	}
}
