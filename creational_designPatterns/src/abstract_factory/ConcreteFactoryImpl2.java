package abstract_factory;

public class ConcreteFactoryImpl2 {

	public Elma getElma() {
		return new YesilElma();
		}
		/**
		* Biber tipinde bir nesne oluşturmak için kullanılır.
		*/
		public Biber getBiber() {
			return new BiberDolmasi();
		}
		
}
