package web.pdf.slides;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import web.page.presentedtopage.PresentedToPageController;
import web.pdf.PDFSlide;
import web.pdf.PDFSlideHelper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.IOUtils;

public class PresentedToSlidePDF implements PDFSlide {
	private String _fileDataName ="src/main/resources/pdf/PresentedTo.txt";
	
	private static final Logger mLog = Logger.getLogger(PresentedToSlidePDF.class.getName());

	public Element getHeaderOne() {
		// Creates a check for the paragraphs contents
		String header = PDFSlideHelper.getKeyValue("header1", this._fileDataName);
		Font font = new Font(FontFamily.TIMES_ROMAN, 25.0f, Font.BOLD, BaseColor.WHITE);
        Chunk chunk = new Chunk(header, font);
       // chunk.setBackground(BaseColor.WHITE);
        Paragraph paragraph = new Paragraph(chunk);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);
        paragraph.setSpacingAfter(50);
        return paragraph;

	}
	
	public Element getHeaderTwo() {
		// Creates a check for the paragraphs contents
		String header = PDFSlideHelper.getKeyValue("header2", this._fileDataName);
		
        
        Font font = new Font(FontFamily.TIMES_ROMAN, 18.0f, Font.BOLD, BaseColor.WHITE);
        Chunk chunk = new Chunk(header,font);
        Paragraph paragraph = new Paragraph(chunk);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);
        paragraph.setSpacingAfter(50);
        return paragraph;

	}
	
	
	public String getBottomText() {
		String footerData = PDFSlideHelper.getKeyValue("footer", this._fileDataName);
		return footerData;
	}
	@Override
	public Element getSildeContent() {

		try {
			
			PdfPTable table = new PdfPTable(3);
			table.setWidthPercentage(60);
			table.setWidths(new int[] { 1, 3, 3 });

			Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

			PdfPCell hcell;
			hcell = new PdfPCell(new Phrase("Id", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Name", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Population", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			PdfPCell cell;

			cell = new PdfPCell(new Phrase("1"));
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);

			cell = new PdfPCell(new Phrase("city"));
			cell.setPaddingLeft(5);
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell);

			cell = new PdfPCell(new Phrase(String.valueOf("test")));
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setPaddingRight(5);
			table.addCell(cell);
			return table;

		} catch (Exception  ex) {

			ex.printStackTrace();
		}

		return null;
	}
}
