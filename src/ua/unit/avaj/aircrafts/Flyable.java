package ua.unit.avaj.aircrafts;

import ua.unit.avaj.WeatherTower;

public interface Flyable {
	void updateConditions();
	void registerTower(WeatherTower weatherTower);
	String getFullId();
}
