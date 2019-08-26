package web.pdf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import web.pdf.slides.PresentedToSlidePDF;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

@Controller
public class PDFController {
	@RequestMapping(value = "/pdfreport", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> generatePDF() {
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream byteArrayInputStream =null;
		try {
			PdfWriter.getInstance(document, out);
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
