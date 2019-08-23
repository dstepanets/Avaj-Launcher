package avaj;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.io.FileNotFoundException;

public class Simulator {

	public Simulator() {

	}


	public static void main(String[] args) throws IOException {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(args[0]));
			String ln = reader.readLine();

			System.out.println("Line: " + ln);

		} catch (FileNotFoundException e) {
			System.out.println("ERROR: I can't find such file, darling :(");
		}

	}

}
