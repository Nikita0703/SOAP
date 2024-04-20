package com.example.soap.models.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "partygcp", propOrder = {
        "partygcpPK",
        "party"}
)
public class partygcp {
    private PartygcpPK partygcpPK;
    private Party party;
}
