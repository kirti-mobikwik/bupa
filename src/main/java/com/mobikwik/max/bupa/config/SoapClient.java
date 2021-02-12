package com.mobikwik.max.bupa.config;

import com.mobikwik.max.bupa.wsdl.AuthenticateUser;
import com.mobikwik.max.bupa.wsdl.AuthenticateUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;
@Service
public class SoapClient{
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;
    public AuthenticateUserResponse getAuthentication(AuthenticateUser request){
        template = new WebServiceTemplate(marshaller);
        AuthenticateUserResponse authentication = (AuthenticateUserResponse) template.marshalSendAndReceive("http://serviceuat.maxbupa.com/LibraWebsitePaymentServicePB/Service1.asmx?WSDL", request);
        return authentication;
    }

}
