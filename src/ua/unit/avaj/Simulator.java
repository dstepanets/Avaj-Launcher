package ua.unit.avaj;

import ua.unit.avaj.aircrafts.AircraftFactory;
import ua.unit.avaj.aircrafts.Flyable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Simulator {

	private static WeatherTower tower;
	private static ArrayList<Flyable> aircrafts = new ArrayList<>();
	private static Logger logger = new Logger();

	public Simulator() {}

	public static void main(String[] args) {

		try {

			if (args.length != 1) {
				throw new AvajException("ERROR: Provide a file path as a single argument");
			}

			BufferedReader reader = new BufferedReader(new FileReader(args[0]));

//			Parse number of simulations
			String ln = reader.readLine();
			if (ln != null) {
				try {
					tower = new WeatherTower(Integer.parseInt(ln));
				} catch (NumberFormatException e) {
					System.out.println("ERROR. Number of simulations (first line of the scenario) must be a positive integer");
				}
			}
//			Parse list of aircrafts
			for (int i = 2; ln != null; i++) {

				ln = reader.readLine();
				if (ln == null || ln.length() == 0)
					continue;

				String split[] = ln.split(" ");
				if (split.length == 0)
					continue;
				if (split.length != 5)
					throw new AvajException("ERROR: Invalid line #" + i + " in a scenario file.");

				try {
					int coords[] = {
							Integer.parseInt(split[2]),
							Integer.parseInt(split[3]),
							Integer.parseInt(split[4])
					};
					for (int c : coords) {
						if (c < 1)
							throw new AvajException("ERROR: Invalid line #" + i + " in a scenario file.\nCoordinates must be POSITIVE INTEGERS!");
					}

					aircrafts.add(AircraftFactory.newAircraft(split[0], split[1], coords[0], coords[1], coords[2]));

				} catch (NumberFormatException e) {
					System.out.println("ERROR: Invalid line #" + i + " in a scenario file.");
					System.out.println("Coordinates must be POSITIVE INTEGERS!");
					AvajException.printInputFileHelp();
				}
			}

//			Run simulation
			for (Flyable a : aircrafts) {
				a.registerTower(tower);
			}

			while (tower.getSimsCount() < tower.getTotalSims()) {
				tower.changeWeather();
				tower.countSimulation();
			}

			System.out.println("We have run " + tower.getTotalSims() + " simulations.");
			System.out.println("Results are logged to simulation.txt file.");

		} catch (AvajException e) {
			System.out.println(e.getMessage());
			AvajException.printInputFileHelp();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: I can't find such file, darling :(");
		} catch (IOException e) {
			System.out.println("ERROR: File reading failed");
		} finally {
			System.out.println("[finally in main]: Close files!!!!");
//			reader.close();
			Logger.closeFile();
		}
	}

}
