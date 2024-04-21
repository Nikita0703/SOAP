package com.example.soap.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "BanksPK", propOrder = {
        "language",
        "accountid",
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BanksPK {
    private String language;
    private BigDecimal accountid;
}
