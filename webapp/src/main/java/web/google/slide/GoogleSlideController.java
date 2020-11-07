package web.google.slide;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@Controller // This means that this class is a Controller

public class GoogleSlideController {
	private static final Logger mLog = Logger.getLogger(GoogleSlideController.class.getName());

	@RequestMapping(value = "/GenerateGoogleSlide", method = RequestMethod.GET)
	public String generate(HttpSession session) {
		// remove value from session
		 Resource resource = new ClassPathResource("classpath:google.json");
		 
	        try {
	        	InputStream inputStream = resource.getInputStream();
	            byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
	            String data = new String(bdata, StandardCharsets.UTF_8);
	            mLog.info(data);
	        } catch (Exception e) {
	        	mLog.severe(e.getMessage());
	        }
		 // ignore id
		String nextPage = "redirect:/GenerateGoogleSlidePage";
		return nextPage;

	}

}
