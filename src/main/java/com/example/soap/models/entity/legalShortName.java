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
@XmlType(name = "legalShortName", propOrder = {
        "legalShortNamePK",
        "legalShortName",
        "party"}
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class legalShortName {
    private LegalShortNamePK legalShortNamePK;

    private String legalShortName;

    private Party party;
}
