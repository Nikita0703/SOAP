package com.example.soap.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quotaimport", propOrder = {
        "gln",
        "quota",
        "restquota",
        "creationdate",
        "creationauthor",
        "lastmodificationdate",
        "authoroflastmodification",
        "party"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quotaimport {
    @XmlElement(name = "gln")
    private BigDecimal gln;

    @XmlElement(name = "quota")
    private Long quota;

    @XmlElement(name = "restquota")
    private Long restquota;

    @XmlElement(name = "creationdate")
    private XMLGregorianCalendar creationdate;

    @XmlElement(name = "creationauthor")
    private String creationauthor;

    @XmlElement(name = "lastmodificationdate")
    private XMLGregorianCalendar lastmodificationdate;

    @XmlElement(name = "authoroflastmodification")
    private String authoroflastmodification;

    @XmlElement(name = "party")
    private Party party;
}

