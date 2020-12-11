package factory_metod;

public class Application {
	public static void main(final String[] args) {
		
		Document document = DocumentFactory.createDocument("PDF");
		
		System.out.println(document.getDocumentType());
		
		document = DocumentFactory.createDocument("WORD");
		
		System.out.println(document.getDocumentType());
		
		document = DocumentFactory.createDocument("POWERPOINT");
		
		System.out.println(document.getDocumentType());
	}
}