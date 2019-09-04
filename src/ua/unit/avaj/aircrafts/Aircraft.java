package ua.unit.avaj.aircrafts;

import ua.unit.avaj.WeatherTower;

public class Aircraft implements Flyable {

	protected long			id;
	protected String		name;
	protected Coordinates	coordinates;
	protected String		type;
	static private long		idCounter = 0;

	protected Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		this.coordinates = coordinates;
		this.type = "DefaultAircraft";
	}

	private long nextId() {
		return (Aircraft.idCounter + 1);
	}

	public void updateConditions() {

	}

	public void registerTower(WeatherTower weatherTower) {

	}

	public String getFullId() {
		return (this.type + '#' + this.name + '(' + this.id + ')');
	}
}
