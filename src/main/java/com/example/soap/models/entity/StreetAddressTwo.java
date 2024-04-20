package com.example.soap.models.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "streetAddresstwo", propOrder = {
        "streetAddresstwoPK",
        "streetAdresstwo",
        "party"}
)
public class StreetAddressTwo {
    private StreetAddressTwoPK streetAddresstwoPK;

    private String streetAdresstwo;

    private Party party;
}
