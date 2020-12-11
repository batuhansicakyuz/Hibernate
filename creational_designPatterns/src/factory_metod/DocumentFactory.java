package factory_metod;

public class DocumentFactory {
	
	public static Document createDocument(final String type) {
		if (type.equals("PDF")) {
			return new Pdf();
		} else if (type.equals("WORD")) {
			return new Word();
		} else {
			throw new RuntimeException("Doküman tipi belli değil!");
		}
	}
}