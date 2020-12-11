package factory;

import java.util.ArrayList;

public abstract class ArabaFabrika {

	private ArrayList<Araba> arabaListesi = new ArrayList<Araba>();

	public ArabaFabrika() {
		createAuto();
	}

	public abstract void createAuto();

	public ArrayList<Araba> getArabaListesi() {
		return arabaListesi;
	}

	public void setArabaListesi(final ArrayList<Araba> arabaListesi) {
		this.arabaListesi = arabaListesi;
	}
}
