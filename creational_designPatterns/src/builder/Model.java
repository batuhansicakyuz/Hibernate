package builder;

public class Model {
	private String model;

	public Model(final String model) {
		setModel(model);
	}

	public String getModel() {
		return model;
	}

	public void setModel(final String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return model;
	}
}