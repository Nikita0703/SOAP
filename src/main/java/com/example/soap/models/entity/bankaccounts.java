package com.example.soap.models.entity;
import javax.xml.bind.annotation.*;

import lombok.Data;

import java.math.BigDecimal;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccounts", propOrder = {
        "accountId",
        "bankId",
        "accountNumber",
        "accountName",
        "iban",
        "banksCollection",
        "gln"
})
@Data
public class bankaccounts extends Banks{

        @XmlElement(name = "accountId")
        private BigDecimal accountId;

        @XmlElement(name = "bankId")
        private Integer bankId;

        @XmlElement(name = "accountNumber")
        private String accountNumber;

        @XmlElement(name = "accountName")
        private String accountName;

        @XmlElement(name = "iban")
        private String iban;

        @XmlElementWrapper(name = "legalNameCollection")
        @XmlElement(name = "banks")
        private List<Banks> banksCollection;

        @XmlElement(name = "gln")
        private Party gln;

}
