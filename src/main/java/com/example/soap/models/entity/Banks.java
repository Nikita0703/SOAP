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
@XmlType(name = "Banks", propOrder = {
        "banksPK",
        "bankid",
        "bankname",
        "bankaddress",
        "bic",
        "bankbranchcode",
        "bankaccounts"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banks {
    private BanksPK banksPK;
    private Integer bankid;
    private String bankname;
    private String bankaddress;
    private String bic;
    private Short bankbranchcode;
    private BankAccounts bankaccounts;
}
