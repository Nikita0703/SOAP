package com.example.soap.models.entity;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
        import javax.xml.bind.annotation.XmlAccessorType;
        import javax.xml.bind.annotation.XmlElement;
        import javax.xml.bind.annotation.XmlRootElement;
        import javax.xml.bind.annotation.XmlType;
        import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
        "contactid",
        "personordepartmentname",
        "communicaionchannelCollection",
        "gln"
})
@Data
public class Contact {
    @XmlElement(name = "contactid")
    private BigDecimal contactid;

    @XmlElement(name = "personordepartmentname")
    private String personordepartmentname;

    @XmlElement(name = "communicaionchannelCollection")
    private List<CommunicaionChannel> communicaionchannelCollection;

    @XmlElement(name = "gln")
    private Party gln;
}
