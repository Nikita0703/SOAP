package com.example.soap.models.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "streetAddressone", propOrder = {
        "streetAddressonePK",
        "streetAdressone",
        "party"}
)
public class StreetAddressOne {

    private StreetAddressonePK streetAddressonePK;

    private String streetAdressone;

    private Party party;
}
