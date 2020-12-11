package builder;

/**
 * Sipariş işlemini gerçekleştirmek için kullanılan sınıf.
 *
 */
public class SiparisManager {
	private SiparisBuilder builder;

	/**
	 * Müşterinin istediği marka, model, renk ve beygir gücüne sahip bir arabanın
	 * siparişi için kullanılan metot.
	 *
	 * @param marka      Sipariş edilen arabanın markası
	 * @param model      Sipariş edilen arabanın modeli
	 * @param renk       Sipariş edilen arabanın rengi
	 * @param beygirgucu Sipariş edilen arabanın beygir gücü
	 *
	 * @return Araba Konfigüre edilmiş araba nesnesi
	 */
	public Araba createOrder(final String marka, final String model, final String renk, final int beygirgucu) {
		if (marka.equals("Ford")) {
			builder = new FordSiparisBuilder();
		} else if (marka.equals("Audi")) {
			builder = new AudiSiparisBuilder();
		}
		builder.setMarka(marka);
		builder.setModel(model);
		builder.setRenk(renk);
		builder.setBeygirGucu(beygirgucu);
		return builder.getAraba();
	}

	/**
	 * Sipariş edilen arabanın özelliklerini ekranda görüntüler.
	 */
	public void printOrder() {
		System.out.println("Marka: " + builder.getAraba().getMarka());
		System.out.println("Model: " + builder.getAraba().getModel());
		System.out.println("Renk: " + builder.getAraba().getRenk());
		System.out.println("Beygirgücğ: " + builder.getAraba().getBeygirGucu());
	}
}