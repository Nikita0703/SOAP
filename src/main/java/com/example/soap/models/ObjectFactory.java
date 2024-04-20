package com.example.soap.models;

import com.example.soap.models.requests.SearchPartiesByModifiedTimeReq;
import com.example.soap.models.responses.SearchPartiesByModifiedTimeResp;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
@NoArgsConstructor
public class ObjectFactory {

    public SearchPartiesByModifiedTimeReq createSearchPartiesByModifiedTimeReq(){
        return new SearchPartiesByModifiedTimeReq();
    }

    public SearchPartiesByModifiedTimeResp createSearchPartiesByModifiedTimeResp(){
        return new SearchPartiesByModifiedTimeResp();
    }

}
