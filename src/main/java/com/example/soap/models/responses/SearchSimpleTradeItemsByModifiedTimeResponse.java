package com.example.soap.models.responses;

import com.example.soap.models.requests.SearchSimpleTraiditemsByModifiedTimeReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SearchSimpleTradeItemsByModifiedTimeResponse")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchSimpleTradeItemsByModifiedTimeResponse {
    @XmlElement(name = "return")
    private SearchSimpleTradeItemsByModifiedTimeResp  resp;
}
