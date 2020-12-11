package singleton;

public class Singleton1 {

	private static int sayi = 0;
	private static Singleton1 singleton1 = new Singleton1();

	private Singleton1() {
		System.out.println("Ben olustum.");
	}
	

	public static Singleton1 getSingleton() {

		sayi++;
		System.out.println(sayi);

		return singleton1;
	}
}
