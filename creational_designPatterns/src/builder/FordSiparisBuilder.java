package builder;

/**
 * Ford marka bir arabanın konfigürasyon ve siparisinde kullanılan sınıf.
 */
public class FordSiparisBuilder extends SiparisBuilder {
	public FordSiparisBuilder() {
	}

	@Override
	public void setBeygirGucu(final int bg) {
		getAraba().setBeygirGucu(bg);
	}

	@Override
	public void setMarka(final String marka) {
		getAraba().setMarka(new Marka(marka));
	}

	@Override
	public void setModel(final String model) {
		getAraba().setModel(new Model(model));
	}

	@Override
	public void setRenk(final String renk) {
		getAraba().setRenk(renk);
	}
}