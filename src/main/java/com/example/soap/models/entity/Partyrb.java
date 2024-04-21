package com.example.soap.models.entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRB", propOrder = {
        "gln",
        "okrb005code",
        "okrb005path",
        "lastbcdsyncdate",
        "unpcode",
        "isiccode",
        "entrydate",
        "tel",
        "fax",
        "email",
        "chieftel",
        "contacttel",
        "temporarylockeddate",
        "exclusiondate",
        "dateSvid",
        "legalform",
        "website",
        "party"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partyrb {
    @XmlElement(name = "gln")
    private Long gln;

    @XmlElement(name = "okrb005code")
    private Integer okrb005code;

    @XmlElement(name = "okrb005path")
    private String okrb005path;

    @XmlElement(name = "lastbcdsyncdate")
    private XMLGregorianCalendar lastbcdsyncdate;

    @XmlElement(name = "unpcode")
    private Integer unpcode;

    @XmlElement(name = "isiccode")
    private Short isiccode;

    @XmlElement(name = "entrydate")
    private XMLGregorianCalendar entrydate;

    @XmlElement(name = "tel")
    private String tel;

    @XmlElement(name = "fax")
    private String fax;

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "chieftel")
    private String chieftel;

    @XmlElement(name = "contacttel")
    private String contacttel;

    @XmlElement(name = "temporarylockeddate")
    private XMLGregorianCalendar temporarylockeddate;

    @XmlElement(name = "exclusiondate")
    private XMLGregorianCalendar exclusiondate;

    @XmlElement(name = "dateSvid")
    private XMLGregorianCalendar dateSvid;

    @XmlElement(name = "legalform")
    private String legalform;

    @XmlElement(name = "website")
    private String website;

    @XmlElement(name = "party")
    private Party party;
}
