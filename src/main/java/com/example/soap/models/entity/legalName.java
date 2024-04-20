package com.example.soap.models.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "legalName", propOrder = {
        "legalNamePK",
        "legalName",
        "party"}
)
public class legalName {
    private LegalNamePK legalNamePK;

    private String legalName;

    private Party party;
}
