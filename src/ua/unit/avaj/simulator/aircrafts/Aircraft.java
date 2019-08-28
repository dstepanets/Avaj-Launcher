package ua.unit.avaj.simulator.aircrafts;

import ua.unit.avaj.simulator.WeatherTower;
import ua.unit.avaj.weather.Coordinates;

public class Aircraft implements Flyable {

	protected long			id;
	protected String		name;
	protected Coordinates	coordinates;
	protected String		type;
	static private long		idCounter;

	protected Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		this.coordinates = coordinates;
		this.type = "DefaultAircraft";
	}

	private long nextId() {

	}

	public void updateConditions() {

	}

	public void registerTower(WeatherTower weatherTower) {

	}

	public String getFullId() {
		return (this.type + '#' + this.name + '(' + this.id + ')');
	}
}
