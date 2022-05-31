package com.db.clmp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

// http://localhost:8099/getNaceDetails/399475
// http://localhost:8099/getNaceDetails/all
// http://localhost:8099/swagger-ui/

// dbnaceSpringClient

@SpringBootApplication
@OpenAPIDefinition
@EnableSwagger2
public class clmpApps
{
    private static final Logger log = LoggerFactory.getLogger(clmpApps.class);

    public static void main( String[] args )
    {
        SpringApplication.run (clmpApps.class, args);
    }

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(regex("/api/putNaceDetails.*"))
                .apis (RequestHandlerSelectors.basePackage("com.db.clmp.controller"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("DB Samples")
                .description("DB Samples")
                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
                .contact(new Contact("Harry Wong", "http://", "harrycywong@gmail.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
                .version("2.0")
                .build();
    }
}
