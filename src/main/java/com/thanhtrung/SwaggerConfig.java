package com.thanhtrung;

import javax.inject.Inject;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.models.dto.builder.ApiInfoBuilder;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableSwagger
public class SwaggerConfig {
    @Inject
    private SpringSwaggerConfig springSwaggerConfig;

    @Bean
    public SwaggerSpringMvcPlugin configureSwagger() {
        SwaggerSpringMvcPlugin swaggerSpringMvcPlugin = new SwaggerSpringMvcPlugin(this.springSwaggerConfig);
        ApiInfo apiInfo = new ApiInfoBuilder().title("QuickPoll REST API")
                .description("QuickPoll API for creating and managing polls")
                .termsOfServiceUrl("http:/example.com/term-of-service").contact("info@gmail.com").license("MIT License")
                .licenseUrl("http://opensource.org/license/MIT").build();
        swaggerSpringMvcPlugin.apiInfo(apiInfo).apiVersion("1.0");
        return swaggerSpringMvcPlugin;
    }
}