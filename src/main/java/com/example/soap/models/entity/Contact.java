package com.example.soap.models.entity;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
        "contactid",
        "personordepartmentname",
        "communicaionchannelCollection",
        "gln"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    @XmlElement(name = "contactid")
    private BigDecimal contactid;

    @XmlElement(name = "personordepartmentname")
    private String personordepartmentname;

    @XmlElementWrapper(name = "communicaionchannelCollection")
    @XmlElement(name = "communicaionchannel")
    private List<CommunicaionChannel> communicaionchannelCollection;

    @XmlElement(name = "gln")
    private Party gln;
}
