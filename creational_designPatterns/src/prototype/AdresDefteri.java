package prototype;

/**
 * Adres defteri programı.
 *
 */
public class AdresDefteri {
	public static void main(final String[] args) throws CloneNotSupportedException {
		final Adres adres = new Adres("Ataturk cad.", "10", "Atasehir", "İstanbul");
		adres.printAdres();
		/*
		 * adres nesnesini clone() metodu ile kopyalıyoruz.
		 */
		final Adres adres2 = (Adres) adres.clone();
		/*
		 * set metotlarını kullanarak, klonlanan nesneyi yeniden yapilandiriyoruz.
		 */
		adres2.setSokak("Ulus cad.");
		adres2.setNo("120");
		adres2.setSemt("Kadiköy");
		adres2.setSemt("İstanbul");
		adres2.printAdres();
	}
}