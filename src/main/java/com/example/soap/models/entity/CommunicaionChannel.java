package com.example.soap.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "communicaionchannel", propOrder = {
        "communicaionchannelPK",
        "contact"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunicaionChannel {
    private CommunicationChannelPK communicaionchannelPK;
    private Contact contact;
}
