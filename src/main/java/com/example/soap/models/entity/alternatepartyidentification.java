package com.example.soap.models.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "alternatepartyidentification", propOrder = {
        "alternatepartyidentificationPK",
        "party"}
)
public class alternatepartyidentification {
    private alternatepartyidentificationPK alternatepartyidentificationPK;
    private Party party;
}
