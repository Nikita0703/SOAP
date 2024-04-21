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
@XmlType(name = "chiefname", propOrder = {
        "chiefnamePK",
        "chiefname",
        "party"}
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class chiefname {
    private ChiefnamePK chiefnamePK;

    private String chiefname;

    private Party party;
}
