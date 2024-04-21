package com.example.soap.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "streetaddressone", propOrder = {
        "streetaddressonePK",
        "streetadressone",
        "party"}
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StreetAddressOne {

    private StreetAddressOnePK streetaddressonePK;

    private String streetadressone;

    private Party party;
}
