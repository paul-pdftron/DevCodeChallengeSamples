import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class OddEven {
	private static final String DEST = "results/oddEven.pdf";
	private static final String IMG = "results/img.PNG";

	static {
		new File(DEST).getParentFile().mkdirs();
	}

	public static void main(String[] args) {
		try {
			Logger logger = Logger.getLogger(HTML.class);
			logger.setLevel(Level.WARN);
			BasicConfigurator.configure();
			new OddEven().createPdf();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void createPdf() throws Exception {
		PdfDocument pdf = new PdfDocument(new PdfWriter(new FileOutputStream(DEST)));

		// TODO create a document

		// TODO create a table

		for (int i = 0; i < 600; i++) {

			// TODO add cells to the table that are alternating red and blue

		}

		// TODO Add table to the document 

		// TODO Add image to the document 

		pdf.close(); 
	}
}
