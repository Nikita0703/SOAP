package com.example.soap.models.entity;

import com.example.soap.models.headers.ApiHeaderRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "simpleTradeitem", propOrder = {
        "brand" ,
       "dateFlag" ,
        "description",
       "header",
        "lastModificationDate",
       "manufactor" ,
       "name" ,
        "subbrand",
        "tnvedCode"
        })
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleTradeItem {
    @XmlElement(name = "brand",nillable = true)
    private String brand;

    @XmlElement(name = "dateFlag",nillable = true)
    private String dateFlag;

    @XmlElement(name = "description",nillable = true)
    private String description;

    @XmlElement(name = "header",nillable = true)
    private ApiHeaderRequest header;

    @XmlElement(name = "lastModificationDate",nillable = true)
    private String lastModificationDate;

    @XmlElement(name = "manufactor",nillable = true)
    private String manufactor;


    @XmlElement(name = "name",nillable = true)
    private String name;

    @XmlElement(name = "subbrand",nillable = true)
    private String subbrand;

    @XmlElement(name = "tnvedCode",nillable = true)
    private String tnvedCode;
}
