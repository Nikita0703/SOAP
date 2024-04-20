package com.example.soap.models.entity;
import java.util.List;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "party", propOrder = {
        "gln",
        "partystartdata",
        "effectivechangedata",
        "partyenddata",
        "city",
        "countryisocode",
        "languageoftheparty",
        "name",
        "currency",
        "poboxnumber",
        "postalcode",
        "provincecode",
        "state",
        "streetaddressone",
        "streetaddresstwo",
        "timeCreated",
        "isfirstgln",
        "firstgln",
        "description",
        "recordCreatedDate",
        "securityusersCollection",
        "postAddressCollection",
        "streetaddressoneCollection",
        "alternatepartyidentificationCollection",
        "quotaimport",
        "partyrolesCollection",
        "bankaccountsCollection",
        "legalNameCollection",
        "contactnameCollection",
        "chiefnameCollection",
        "partyrb",
        "partytaxinformationCollection",
        "partygcpCollection",
        "cityCollection",
        "streetaddresstwoCollection",
        "legalShortNameCollection",
        "contactCollection"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Party {
    private Long gln;
    private LocalDateTime partystartdata;
    private LocalDateTime effectivechangedata;
    private LocalDateTime partyenddata;
    private String city;
    private String countryisocode;
    private String languageoftheparty;
    private String name;
    private String currency;
    private String poboxnumber;
    private String postalcode;
    private String provincecode;
    private String state;
    private String streetaddressone;
    private String streetaddresstwo;
    private LocalDateTime timeCreated;
    private Short isfirstgln;
    private Long firstgln;
    private String description;
    private Long recordCreatedDate;

    @XmlElementWrapper(name = "securityusersCollection")
    @XmlElement(name = "SecurityUsers")
    private List<SecurityUsers> securityusersCollection;

    @XmlElementWrapper(name = "postAddressCollection")
    @XmlElement(name = "postAddress")
    private List<PostAddress> postAddressCollection;

    @XmlElementWrapper(name = "streetaddressoneCollection")
    @XmlElement(name = "streetaddressone")
    private List<StreetAddressOne> streetaddressoneCollection;

    @XmlElementWrapper(name = "alternatepartyidentificationCollection")
    @XmlElement(name = "alternatepartyidentification")
    private List<alternatepartyidentification> alternatepartyidentificationCollection;

    @XmlElement(name = "quotaimport")
    private Quotaimport quotaimport;

    @XmlElementWrapper(name = "partyrolesCollection")
    @XmlElement(name = "partyroles")
    private List<partyroles> partyrolesCollection;

    @XmlElementWrapper(name = "bankaccountsCollection")
    @XmlElement(name = "bankaccounts")
    private List<bankaccounts> bankaccountsCollection;

    @XmlElementWrapper(name = "legalNameCollection")
    @XmlElement(name = "legalName")
    private List<legalName> legalNameCollection;

    @XmlElementWrapper(name = "contactnameCollection")
    @XmlElement(name = "contactname")
    private List<contactname> contactnameCollection;

    @XmlElementWrapper(name = "chiefnameCollection")
    @XmlElement(name = "chiefname")
    private List<chiefname> chiefnameCollection;

    @XmlElement(name = "partyrb")
    private Partyrb partyrb;

    @XmlElementWrapper(name = "partytaxinformationCollection")
    @XmlElement(name = "partytaxinformation")
    private List<partytaxinformation> partytaxinformationCollection;

    @XmlElementWrapper(name = "partygcpCollection")
    @XmlElement(name = "partygcp")
    private List<partygcp> partygcpCollection;

    @XmlElementWrapper(name = "cityCollection")
    @XmlElement(name = "city")
    private List<City> cityCollection;

    @XmlElementWrapper(name = "streetaddresstwoCollection")
    @XmlElement(name = "streetaddresstwo")
    private List<StreetAddressTwo> streetaddresstwoCollection;

    @XmlElementWrapper(name = "legalShortNameCollection")
    @XmlElement(name = "legalShortName")
    private List<legalShortName> legalShortNameCollection;

    @XmlElementWrapper(name = "contactCollection")
    @XmlElement(name = "contact")
    private List<Contact> contactCollection;


}
