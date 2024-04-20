package com.example.soap.models.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "chiefname", propOrder = {
        "chiefnamePK",
        "chiefname",
        "party"}
)
public class chiefname {
    private ChiefnamePK chiefnamePK;

    private String chiefname;

    private Party party;
}
