package fr.eni.bibli.securingWeb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	public void addViewControllers(ViewControllerRegistry registry) {
////		registry.addViewController("/").setViewName("accueil");
//		registry.addViewController("/liste").setViewName("liste");
		registry.addViewController("/login").setViewName("login");
	}
}
