package builder;

public class Test {
	public static void main(final String[] args) {
		SiparisManager manager = new SiparisManager();
		manager.createOrder("Ford", "Focus", "Beyaz", 70);
		manager.printOrder();
		manager = new SiparisManager();
		manager.createOrder("Audi", "A5", "Siyah", 270);
		manager.printOrder();
	}
}