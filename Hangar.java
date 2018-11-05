public class Hangar {

	public static void main (String[] args) {

		Car renault = new Car("Clio", 100000);
		Boat paquebot = new Boat("Titanic", 2000);

		System.out.println(renault.doStuff());
		System.out.println(paquebot.doStuff());
	}
}