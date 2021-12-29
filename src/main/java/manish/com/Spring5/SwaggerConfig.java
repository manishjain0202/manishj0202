package manish.com.Spring5;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Documentation;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig{
	
	public Docket api() {
		return null;
	
	//	return Docket(DocumentationType.SWAGGER_2)
	}		
	}
