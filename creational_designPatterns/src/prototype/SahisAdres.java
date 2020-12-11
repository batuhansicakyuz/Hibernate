package prototype;

/**
 * Bir şahıs adresini temsil eden sınıf.
 *
 */
public class SahisAdres extends AdresPrototype {
	private String isim;
	private String soyad;

	public SahisAdres(final String sokak, final String no, final String semt, final String şehir, final String isim,
			final String soyad) {
		setSokak(sokak);
		setNo(no);
		setSemt(semt);
		setSehir(şehir);
		setIsim(isim);
		setSoyad(soyad);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(final String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(final String soyad) {
		this.soyad = soyad;
	}
}