package ua.unit.avaj.simulator.aircrafts;

import ua.unit.avaj.simulator.WeatherTower;
import ua.unit.avaj.weather.Coordinates;

public class Aircraft implements Flyable {

	protected long			id;
	protected String		name;
	protected Coordinates	coordinates;
	static private long		idCounter;

	protected Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		this.coordinates = coordinates;
	}

	private long nextId() {

	}

	public void updateConditions() {

	}

	public void registerTower(WeatherTower weatherTower) {

	}
}
