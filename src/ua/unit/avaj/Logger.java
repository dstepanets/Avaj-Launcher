package ua.unit.avaj;

import java.io.*;


public class Logger {

	private static  BufferedWriter writer;
	private static 	File simFile;

	Logger() {
		try {
			simFile = new File("simulation.txt");
			simFile.delete();
			if (writer == null)
				writer = new BufferedWriter(new FileWriter(simFile, true));
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
			if (writer != null)
				writer.close();
		} catch (IOException ioe) {
			System.out.println("ERROR. Couldn't close simulation.txt file :(");
		}
	}
}
