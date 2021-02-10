package com.mobikwik.max.bupa.config;

import com.mobikwik.max.bupa.wsdl.AuthenticateUser;
import com.mobikwik.max.bupa.wsdl.AuthenticateUserResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class SoapClient extends WebServiceGatewaySupport {
    public AuthenticateUserResponse authenticateUser(String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (AuthenticateUserResponse) res.getValue();
    }

}
