package dio.web.api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato() {
        return new Contact(
            "Nathália Cericatto",
            "https://github.com/Nathuyy",
            "nathalia.cericatto@gmail.com"
        );
    }
    
    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder
            .title("API - Rest ")
            .description("Primeira API usando SpringBoot")
            .version("1.0.0")
            .license("Apache License Version 2.0")
            .licenseUrl("https://github.com/Nathuyy");
        return apiInfoBuilder;
    }

    @Bean
    public Docket detalheApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket
            .select()
            .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller"))
            .build()
            .apiInfo(informacoesApi().build());
        return docket;
    }
}
