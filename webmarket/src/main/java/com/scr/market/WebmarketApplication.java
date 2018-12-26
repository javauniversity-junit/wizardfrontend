package com.scr.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebmarketApplication  extends SpringBootServletInitializer {
     private static final Logger LOGGER = Logger.getLogger(WebmarketApplication.class.getName());

   @Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebmarketApplication.class);
}


	public static void main(String[] args) {
	    LOGGER.info("main  start");
		SpringApplication.run(WebmarketApplication.class, args);
	}

}

