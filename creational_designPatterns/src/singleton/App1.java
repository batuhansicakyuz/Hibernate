package singleton;

public class App1 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Singleton1.getSingleton();
		}
		
	//	Singleton1 singleton1 = Singleton1.getSingleton();
	}
}
