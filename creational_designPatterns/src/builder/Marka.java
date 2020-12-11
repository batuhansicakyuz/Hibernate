package builder;

public class Marka {
	private String marka;

	public Marka(final String marka) {
		setMarka(marka);
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(final String marka) {
		this.marka = marka;
	}

	@Override
	public String toString() {
		return marka;
	}
}