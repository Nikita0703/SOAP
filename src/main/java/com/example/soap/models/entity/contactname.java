package com.example.soap.models.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "contactname", propOrder = {
        "contactnamePK",
        "contactname",
        "party"}
)
public class contactname {
    private  ContactnamePK  contactnamePK;

    private String  contactname;

    private Party party;
}
