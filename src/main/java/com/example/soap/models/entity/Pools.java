package com.example.soap.models.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "Pools", propOrder = {
        "poolsPK",
        "type",
        "created",
        "lastmodified",
        "datesync",
        "poolscontentCollection",
        "securityusers"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pools {
    private PoolsPK poolsPK;
    private Short type;
    private XMLGregorianCalendar created;
    private XMLGregorianCalendar lastmodified;
    private XMLGregorianCalendar datesync;
    @XmlElementWrapper(name = "poolscontentCollection")
    @XmlElement(name = "poolscontent")
    private List<PoolsContent> poolscontentCollection;
    private SecurityUsers securityusers;
}
