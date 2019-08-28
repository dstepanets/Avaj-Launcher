package ua.unit.avaj.simulator.aircrafts;

import ua.unit.avaj.simulator.WeatherTower;

public interface Flyable {
	void updateConditions();
	void registerTower(WeatherTower weatherTower);
	String getFullId();
}
