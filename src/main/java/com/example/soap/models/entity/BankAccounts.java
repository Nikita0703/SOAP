package com.example.soap.models.entity;
import javax.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

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
@AllArgsConstructor
@NoArgsConstructor
public class BankAccounts extends Banks{

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
