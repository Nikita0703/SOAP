package com.example.soap.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
@RequiredArgsConstructor
public class WebServiceTemplateConfig {

    private final  Jaxb2Marshaller marshaller;

    @Bean
    public WebServiceTemplate webServiceTemplate(){
        return new WebServiceTemplate(marshaller);
    }
}
