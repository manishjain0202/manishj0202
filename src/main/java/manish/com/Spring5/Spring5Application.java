package manish.com.Spring5;

import java.util.Locale;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class Spring5Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5Application.class, args);
	}
	
	@Bean
	LocalResolver localResolver(){
	//	SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.UK);
		return localResolver();
	}
}
