package com.mobikwik.max.bupa.config;

import com.mobikwik.max.bupa.wsdl.AuthenticateUser;
import com.mobikwik.max.bupa.wsdl.AuthenticateUserResponse;
import com.mobikwik.max.bupa.wsdl.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private SoapClient soapClient;
    public AuthenticateUserResponse invokeClient(@RequestBody AuthenticateUser request){
        return soapClient.getAuthentication(request);
    }
}
