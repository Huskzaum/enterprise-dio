package com.dio.enterprise.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Contact contact = new Contact()
                .name("DIO")
                .url("https://web.digitalinnovation.one")
                .email("contato@digitalinnovationone.com.br");
        final Info info = new Info()
                .title("API-REST")
                .description("Enterprise API made on DIO.")
                .version("1.0.0")
                .contact(contact);
        return new OpenAPI()
                .info(info);
    }
}
