package builder;

/**
 * Sipariş sürecinde konfigürasyon için kullanılacak metotlar bu sınıf içinde
 * yer almaktadır. Belirli bir marka arabanın sipariş için altsiniflarin
 * olusturulmsi gerekmektedir.
 *
 */
public abstract class SiparisBuilder {
	private Araba araba = null;

	public SiparisBuilder() {
	}

	public Araba getAraba() {
		if (araba == null) {
			araba = new Araba();
		}
		return araba;
	}

	public abstract void setMarka(String marka);

	public abstract void setModel(String model);

	public abstract void setRenk(String renk);

	public abstract void setBeygirGucu(int bg);
}
