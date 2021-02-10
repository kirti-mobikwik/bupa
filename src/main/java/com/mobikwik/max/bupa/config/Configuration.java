package com.mobikwik.max.bupa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@org.springframework.context.annotation.Configuration
public class Configuration {
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.mobikwik.max.bupa.wsdl");
        return marshaller;
    }
    @Bean
    public SoapClient soapConnector(Jaxb2Marshaller marshaller){
        SoapClient client = new SoapClient();
        client.setDefaultUri("http://serviceuat.maxbupa.com/LibraWebsitePaymentServicePB/Service1.asmx?WSDL");
        client.setMarshaller(marshaller());
        client.setUnmarshaller(marshaller());
        return client;
    }
}
