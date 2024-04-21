package com.example.soap.models.entity;
import java.util.List;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "SecurityUsers", propOrder = {
        "username",
        "password",
        "enabled",
        "fio",
        "post",
        "mail",
        "epassquota",
        "epasstransactions",
        "creationdate",
        "creationauthor",
        "lastmodificationdate",
        "authoroflastmodification",
        "expirationdate",
        "totalquota",
        "glncomment",
        "partyCollection",
        "userpoolsCollection",
        "securityauthoritiesCollection",
        "poolsCollection"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SecurityUsers extends SecurityUsersAddons{
    private String username;
    private String password;
    private short enabled;
    private String fio;
    private String post;
    private String mail;
    private Long epassquota;
    private Long epasstransactions;
    private LocalDateTime creationdate;
    private String creationauthor;
    private LocalDateTime lastmodificationdate;
    private String authoroflastmodification;
    private LocalDateTime expirationdate;
    private Long totalquota;
    private String glncomment;

    @XmlElementWrapper(name = "partyCollection")
    @XmlElement(name = "party")
    private List<Party> partyCollection;

    @XmlElementWrapper(name = "userpoolsCollection")
    @XmlElement(name = "userPools")
    private List<UserPools> userpoolsCollection;

    @XmlElementWrapper(name = "securityauthoritiesCollection")
    @XmlElement(name = "securityAuthorities")
    private List<SecurityAuthorities> securityauthoritiesCollection;

    @XmlElementWrapper(name = "poolsCollection")
    @XmlElement(name = "pools")
    private List<Pools> poolsCollection;

}
