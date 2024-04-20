package com.example.soap.models.entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;

import java.math.BigDecimal;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTaxInformation", propOrder = {
        "partytaxinformationid",
        "taxamount",
        "taxauthority",
        "taxpercent",
        "taxregistrationnumber",
        "typeoftaxragistration",
        "gln"
})
@Data
public class partytaxinformation {
    @XmlElement(name = "partytaxinformationid")
    private BigDecimal partytaxinformationid;

    @XmlElement(name = "taxamount")
    private String taxamount;

    @XmlElement(name = "taxauthority")
    private String taxauthority;

    @XmlElement(name = "taxpercent")
    private BigDecimal taxpercent;

    @XmlElement(name = "taxregistrationnumber")
    private String taxregistrationnumber;

    @XmlElement(name = "typeoftaxragistration")
    private String typeoftaxragistration;

    @XmlElement(name = "gln")
    private Party gln;
}
