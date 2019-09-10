package ua.unit.avaj;

import ua.unit.avaj.aircrafts.Coordinates;

public class WeatherTower extends Tower {

//	Not in UML. Simulations counters.
	private int		totalSimulations;
	private int		simulationsCount;

	WeatherTower(int totalSims) throws NumberFormatException {
		if (totalSims < 0)
			throw new NumberFormatException();

		this.totalSimulations = totalSims;
		this.simulationsCount = 0;
	}

	public int getTotalSims() {	return this.totalSimulations; }
	public int getSimsCount() {	return this.simulationsCount; }
	public void countSimulation() { this.simulationsCount++; }

//	In UML:
	public String getWeather(Coordinates coordinates) {
		return  WeatherProvider.getProvider().getCurrentWeather(coordinates);
	}

	void changeWeather() {
		this.conditionsChanged();
	}
}
