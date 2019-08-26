package web.pdf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

import web.pdf.slides.PresentedToSlidePDF;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

@Controller
public class PDFController {
	@RequestMapping(value = "/pdfreport", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> generatePDF(@RequestParam String ID) {
		Integer idInt = Integer.parseInt(ID);
		//add background color
		//Rectangle pageSize = new Rectangle(600, 720);
		//pageSize.setBackgroundColor(new BaseColor(0xFF, 0xFF, 0xDE));
		Document document = new Document();
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream byteArrayInputStream =null;
		try {
			PdfWriter pdfWriter = PdfWriter.getInstance(document, out);
			pdfWriter.setPageEvent(new GradientBackground());
			document.open();
			PresentedToSlidePDF presentedToPagePDF = new PresentedToSlidePDF();
			document.add(presentedToPagePDF.getSildeContent());

			document.close();
			byteArrayInputStream = new ByteArrayInputStream(out.toByteArray());
			
			//new ByteArrayInputStream(out.toByteArray());
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(byteArrayInputStream));
    }

}
