package ua.unit.avaj.simulator;

import ua.unit.avaj.weather.Coordinates;
import ua.unit.avaj.weather.WeatherProvider;

public class WeatherTower extends Tower {

//	Not in UML. Simulations counters.
	private static int		totalSimulations;
	private static int		simulationsCount;

	WeatherTower(int totalSims) {
		this.totalSimulations = totalSims;
		this.simulationsCount = 0;
	}

	public int getTotalSims() {	return WeatherTower.totalSimulations; }
	public int getSimsCount() {	return WeatherTower.simulationsCount; }
	public void countSimulation() { WeatherTower.simulationsCount++; }

//	In UML:
	public String getWeather(Coordinates coordinates) {
		return  WeatherProvider.getProvider().getCurrentWeather(coordinates);
	}

	private void changeWeather() {
		this.conditionsChanged();
	}
}
