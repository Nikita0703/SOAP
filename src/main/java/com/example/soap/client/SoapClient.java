package com.example.soap.client;

import com.example.soap.models.login.Login;
import com.example.soap.models.login.LoginResponse;
import com.example.soap.models.requests.*;
import com.example.soap.models.responses.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
@RequiredArgsConstructor
public class SoapClient {

    private final WebServiceTemplate template;


    public SearchPartiesByModifiedTimeResponse searchPartiesByModifiedTime(SearchPartiesByModifiedTime request) {
        SearchPartiesByModifiedTimeResponse acknowledgement = (SearchPartiesByModifiedTimeResponse) template.marshalSendAndReceive(
                                                      "http://www.epass.by:80/BEPTGlobalService",
                                                           request);
        return acknowledgement;
    }

    public SearchSimpleTradeItemsByModifiedTimeResponse searchSimpleTradeItemsByModifiedTime(SearchSimpleTraideitemsByModifiedTime req){
        SearchSimpleTradeItemsByModifiedTimeResponse acknowledgement = (SearchSimpleTradeItemsByModifiedTimeResponse) template.marshalSendAndReceive(
                                                                   "http://www.epass.by:80/BEPTGlobalService",
                                                                    req);
        return acknowledgement;
    }

    public GetFullPartyByGLNResponse getFullPartyByGLN(GetFullPartyByGLN req){
        GetFullPartyByGLNResponse acknowledgement = (GetFullPartyByGLNResponse) template.marshalSendAndReceive(
                                            "http://www.epass.by:80/BEPTGlobalService",
                                                 req);
        return acknowledgement;
    }

    public LoginResponse Login(Login req){
        LoginResponse acknowledgement = (LoginResponse) template.marshalSendAndReceive(
                                    "http://www.epass.by:80/BEPTGlobalService",
                                         req);
        return acknowledgement;
    }




}
