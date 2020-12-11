package abstract_factory;

public class Test {

	public static void main(String[] args) {
		
		AbstractFactory factory = new ConcreteFactoryImpl();
		
		Elma elma = factory.getElma();
		Biber biber = factory.getBiber();
		
		System.out.println(elma.getType());
		System.out.println(biber.getType());
		
		ConcreteFactoryImpl2 factory2 = new ConcreteFactoryImpl2();
		
		elma = factory2.getElma();
		biber = factory2.getBiber();
		System.out.println(elma.getType());
		System.out.println(biber.getType());
	}
}
