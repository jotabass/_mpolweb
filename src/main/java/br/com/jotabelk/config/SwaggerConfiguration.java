package br.com.jotabelk.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@Configuration
@EnableSwagger2

public class SwaggerConfiguration {
	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.jotabelk")).paths(PathSelectors.ant("/**")).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("API para cadastro de pessoas", "Sistema Spring Boot API / Hibernate JPA", "Versão 1.0",
				"http://www.jotabelk.com.br",
				new Contact("COTI Informática", "http://www.jotabelk.com.br", "contato@jotabelk.com.br"),
				"Licença da API", "http://www.jotabelk.com.br", Collections.emptyList());
	}

}
