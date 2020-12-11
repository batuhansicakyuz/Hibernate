package prototype;

/**
 * Klonlanabilir nesneler oluşturmak için kullanılan sınıf.
 *
 */
public abstract class AdresPrototype implements Cloneable {
	private String sokak;
	private String no;
	private String semt;
	private String şehir;

	/**
	 * Altsınıflardan oluşturulan nesneleri klonlamak için kullanılan metot.
	 *
	 * @throws CloneNotSupportedException
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(final String sokak) {
		this.sokak = sokak;
	}

	public String getNo() {
		return no;
	}

	public void setNo(final String no) {
		this.no = no;
	}

	public String getSemt() {
		return semt;
	}

	public void setSemt(final String semt) {
		this.semt = semt;
	}

	public String getSehir() {
		return şehir;
	}

	public void setSehir(final String şehir) {
		this.şehir = şehir;
	}

	public void printAdres() {
		System.out.println("Sokak: " + getSokak());
		System.out.println("No: " + getNo());
		System.out.println("Semt: " + getSemt());
		System.out.println("Sehir: " + getSehir());
		System.out.println("hashCode: " + hashCode());
	}

	
	
	
}