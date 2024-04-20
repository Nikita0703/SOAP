package com.example.soap.models.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "postAddress", propOrder = {
        "postAddressPK",
        "postAdress",
        "party"}
)
public class PostAddress {

        private PostAddressPK postAddressPK;

        private String postAdress;

        private Party party;
}
