package web.controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import web.model.User;
import web.page.Pages;

import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MyErrorController implements ErrorController {
	Logger mlogger = Logger.getLogger(this.getClass().getName());
    public MyErrorController() {}

    @GetMapping(value = "/error")
    public ModelAndView handleError(HttpServletRequest request) {
    	 mlogger.info(new Object(){}.getClass().getEnclosingMethod().getName() + " beginning ");
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        
        String errorMsg = "nothing";
        int httpErrorCode = getErrorCode(request);
        ModelAndView model = new ModelAndView();
  	  
  	  
  	  model.setViewName("/error");
      
        switch (httpErrorCode) {
            case 400: {
                errorMsg = "Http Error Code: 400. Bad Request";
                break;
            }
            case 401: {
                errorMsg = "Http Error Code: 401. Unauthorized";
                break;
            }
            case 404: {
                errorMsg = "Http Error Code: 404. Resource not found";
                break;
            }
            case 500: {
                errorMsg = "Http Error Code: 500. Internal Server Error";
                break;
            }
        }
        
        
        model.addObject("error", errorMsg);

        
        return model;
    }
    private int getErrorCode(HttpServletRequest httpRequest) {
        return (Integer) httpRequest
          .getAttribute("javax.servlet.error.status_code");
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }


}
