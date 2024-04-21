package com.example.soap.models.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SearchPartiesByModifiedTime")
@XmlType(propOrder = {
        "request"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchPartiesByModifiedTime {
    @XmlElement(name = "request")
    private SearchPartiesByModifiedTimeReq request;
}
