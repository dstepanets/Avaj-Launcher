package ua.unit.avaj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

	static private BufferedWriter writer;

	Logger() {
		try {
			if (this.writer == null)
				this.writer = new BufferedWriter(new FileWriter("simulation.txt", true));
		} catch (IOException ioe) {
			System.out.println("ERROR. Couldn't create simulation.txt file :(");
		}
	}

	public static void logLine(String msg) {
		try {
			writer.write(msg);
			writer.newLine();
			writer.flush();
		} catch (IOException ioe) {
			System.out.println("ERROR. Couldn't append to simulation.txt file :(");
		}
	}

	public static void closeFile() {
		try {
			writer.close();
		} catch (IOException ioe) {
			System.out.println("ERROR. Couldn't close simulation.txt file :(");
		}
	}
}
