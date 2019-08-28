package ua.unit.avaj.simulator;

import ua.unit.avaj.simulator.aircrafts.Flyable;
import java.util.List;
import java.util.ArrayList;

public class Tower {
	private List<Flyable> observers = new ArrayList<>();

	public void register(Flyable flyable) {
		if (!observers.contains(flyable)) {
			observers.add(flyable);
			Logger.logLine("Tower says: " + flyable.getFullId() + " registered to weather tower.");
		}
	}

	public void unregister(Flyable flyable) {
		observers.remove(flyable);
		Logger.logLine("Tower says: " + flyable.getFullId() + " unregistered from weather tower.");
	}

	protected void conditionsChanged() {
		for (Flyable f : observers) {
			f.updateConditions();
		}
	}
}
