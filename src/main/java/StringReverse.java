import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.File;

public class StringReverse {
	private static final String DEST = "results/reverse.pdf";

	static {
		new File(DEST).getParentFile().mkdirs();
	}

	public static void main(String[] args) {
		try {
			Logger logger = Logger.getLogger(StringReverse.class);
			logger.setLevel(Level.WARN);
			BasicConfigurator.configure();
			new StringReverse().createPdf();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createPdf() throws Exception {
		String text = "Reverse this String!";
		PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));

		//TODO create a document

		//TODO add text paragraph to the document

		//TODO add reversed text paragraph to the document

		pdf.close();
	}

	private String reverse(String text) {
		//TODO Reverse a string using any logic. Do not use any standard java API to reverse the string.
		String rev = "";


		
		System.out.println(rev);
		//TODO Reverse a string using any logic. Do not use any standard java API to reverse the string.
		return rev;
	}
}
