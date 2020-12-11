package abstract_factory;

public class ConcreteFactoryImpl implements AbstractFactory {

	@Override
	public Elma getElma() {
		return new KirmiziElma();
	}

	@Override
	public Biber getBiber() {
		return new DolmaBiber();
	}

}
