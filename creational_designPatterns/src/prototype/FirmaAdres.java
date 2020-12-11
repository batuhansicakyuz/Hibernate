package prototype;

/**
 * Bir firma adresini temsil eden sınıf.
 *
 */
public class FirmaAdres extends AdresPrototype {
	private String firma;

	public FirmaAdres(final String sokak, final String no, final String semt, final String şehir, final String firma) {
		setSokak(sokak);
		setNo(no);
		setSemt(semt);
		setSehir(şehir);
		setFirma(firma);
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(final String firma) {
		this.firma = firma;
	}
}