package com.example.soap.models.responses;

import com.example.soap.models.requests.SearchPartiesByModifiedTimeReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SearchPartiesByModifiedTimeResponse")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchPartiesByModifiedTimeResponse {
    @XmlElement(name = "return")
    private SearchPartiesByModifiedTimeResp resp;
}
