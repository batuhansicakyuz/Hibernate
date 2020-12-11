package builder;

/**
 * Audi marka bir arabanın konfigürasyon ve siparisinde kullanilam sınıf.
 *
 */
public class AudiSiparisBuilder extends SiparisBuilder {
	public AudiSiparisBuilder() {
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
