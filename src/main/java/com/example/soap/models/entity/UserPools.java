package com.example.soap.models.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "UserPools", propOrder = {
        "userpoolsPK",
        "created",
        "lastmodified",
        "securityusers",
        "userpoolscontentCollection"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPools  extends TradeItemAddons {
    private UserPoolsPK userpoolsPK;
    private XMLGregorianCalendar created;
    private XMLGregorianCalendar lastmodified;
    private SecurityUsers securityusers;
    private List<UserPoolsContent> userpoolscontentCollection;
}
