package ua.unit.avaj.aircrafts;

public class Aircraft {

	protected long			id;
	protected String		name;
	protected Coordinates	coordinates;
	protected String		type;
	static private long		idCounter = 1;

	protected Aircraft(String name, Coordinates coordinates) {
		this.id = this.nextId();
		this.name = name;
		this.coordinates = coordinates;
		this.type = "DefaultAircraft";
	}

	private long nextId() {
		return (Aircraft.idCounter++);
	}

	// Not in UML
	public String getFullId() {
		return (this.type + '#' + this.name + '(' + this.id + ')');
	}

}
