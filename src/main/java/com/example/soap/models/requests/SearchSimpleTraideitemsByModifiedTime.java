package com.example.soap.models.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SearchSimpleTraideitemsByModifiedTime")
@XmlType(propOrder = {
        "request"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchSimpleTraideitemsByModifiedTime {
    private SearchSimpleTraiditemsByModifiedTimeReq request;
}
