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
@XmlType(name = "chiefnamePK", propOrder = {
        "gln",
        "language"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiefnamePK {
    private Long gln;
    private String language;
}
