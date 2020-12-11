package builder;

public class FluentBuilder {
	private Marka marka;
	private Model model;
	private int beygirGucu;
	private String renk;

	public static FluentBuilder startBuilding() {
		return new FluentBuilder();
	}

	public FluentBuilder withMarka(final Marka marka) {
		this.marka = marka;
		return this;
	}

	public FluentBuilder withModel(final Model model) {
		this.model = model;
		return this;
	}

	public FluentBuilder withBeygirGucu(final int bg) {
		beygirGucu = bg;
		return this;
	}

	public FluentBuilder withRenk(final String renk) {
		this.renk = renk;
		return this;
	}

	public Araba build() {
		final Araba araba = new Araba();
		araba.setMarka(marka);
		araba.setModel(model);
		araba.setRenk(renk);
		araba.setBeygirGucu(beygirGucu);
		return araba;
	}

	public static void main(final String[] args) {
		FluentBuilder.startBuilding().withMarka(new Marka("Fiat")).withModel(new Model("Dublo")).withBeygirGucu(200)
				.withRenk("beyaz").build();

	}
}
