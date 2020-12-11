package prototype;

/**
 * Genel bir adres verisini temsil eden sınıf.
 *
 */
public class Adres extends AdresPrototype {
	public Adres(final String sokak, final String no, final String semt, final String şehir) {
		setSokak(sokak);
		setNo(no);
		setSemt(semt);
		setSehir(şehir);
	}
}
// FirmaAdres sınıfı
