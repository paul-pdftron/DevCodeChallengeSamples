import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.File;
import java.util.*;

public class Sort {
	private static final String DEST = "results/sort.pdf";

	static {
		new File(DEST).getParentFile().mkdirs();
	}

	public static void main(String[] args) {
		try {
			Logger logger = Logger.getLogger(Sort.class);
			logger.setLevel(Level.WARN);
			BasicConfigurator.configure();
			new Sort().createPdf();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createPdf() throws Exception {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20 + 1);
		}
		PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
		Document doc = new Document(pdf);
		doc.add(new Paragraph("Unsorted"));
		doc.add(printArray(array));
		doc.add(new Paragraph("Sorted"));
		doc.add(printArray(sort(array)));
		pdf.close();
	}

	private Table printArray(int[] array) {
		Table table = new Table(1);
		for (int i = 0; i < array.length; i++) {
			// Add number to the table cell
			table.addCell(String.valueOf(array[i]));
		}
		return table;
	}

	private int[] sort(int[] array) {
		
		// TODO Sort the array using any sorting algorithm. No standard Java in-built API to be used

		
		return array;
	}
}