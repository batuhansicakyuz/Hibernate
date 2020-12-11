package builder;

public class Araba {
	private Marka marka = null;
	private Model model = null;
	private String renk = null;
	private int beygirGucu = 0;

	public Araba() {
	}

	public Model getModel() {
		return model;
	}

	public void setModel(final Model model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(final String renk) {
		this.renk = renk;
	}

	public int getBeygirGucu() {
		return beygirGucu;
	}

	public void setBeygirGucu(final int beygirGucu) {
		this.beygirGucu = beygirGucu;
	}

	public Marka getMarka() {
		return marka;
	}

	public void setMarka(final Marka marka) {
		this.marka = marka;
	}
}