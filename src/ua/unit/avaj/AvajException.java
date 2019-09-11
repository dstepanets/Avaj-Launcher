package ua.unit.avaj;

public class AvajException extends Exception{

	public AvajException() {}

	public AvajException(String msg) {
		super(msg);
	}

	public static void printInputFileHelp() {
		System.out.println("===================================================================");
		System.out.println("SCENARIO INPUT FILE FORMAT:");
		System.out.println("A) First line:");
		System.out.println("\t<PositiveInt>\n\t(NumberOfSimulationsToRun)");
		System.out.println("B) All following lines - list of participating aircrafts in format:");
		System.out.println("\t<String> <String> <PositiveInt> <PositiveInt> <PositiveInt>");
		System.out.println("\t(Type) (Name) (Longitude) (Latitude) (Height)");
		System.out.println("For example:\n\t5\n\tJetPlane J1 23 44 32\n\tHelicopter H1 654 33 20");
		System.out.println("\n* 3 types of aircraft are available: Helicopter, JetPlane, Baloon.");
		System.out.println("* Empty lines are ignored.");
		System.out.println("===================================================================");

	}
}
