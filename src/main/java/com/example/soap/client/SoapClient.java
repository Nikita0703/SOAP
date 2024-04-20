package com.example.soap.client;

import com.example.soap.models.requests.SearchPartiesByModifiedTimeReq;
import com.example.soap.models.requests.SearchSimpleTraiditemsByModifiedTimeReq;
import com.example.soap.models.responses.SearchPartiesByModifiedTimeResp;
import com.example.soap.models.responses.SearchSimpleTradeItemsByModifiedTimeResp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
@RequiredArgsConstructor
public class SoapClient {

    private final WebServiceTemplate template;


    public SearchPartiesByModifiedTimeResp searchPartiesByModifiedTime(SearchPartiesByModifiedTimeReq request) {
        SearchPartiesByModifiedTimeResp acknowledgement = (SearchPartiesByModifiedTimeResp) template.marshalSendAndReceive(
                                                      "http://www.epass.by:80/BEPTGlobalService",
                                                           request);
        return acknowledgement;
    }

    public SearchSimpleTradeItemsByModifiedTimeResp searchSimpleTradeItemsByModifiedTime(SearchSimpleTraiditemsByModifiedTimeReq req){
        SearchSimpleTradeItemsByModifiedTimeResp acknowledgement = (SearchSimpleTradeItemsByModifiedTimeResp) template.marshalSendAndReceive(
                                                               "http://www.epass.by:80/BEPTGlobalService",
                                                                    req);
        return acknowledgement;
    }




}
