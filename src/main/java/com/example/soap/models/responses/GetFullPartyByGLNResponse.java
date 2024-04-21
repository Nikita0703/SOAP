package com.example.soap.models.responses;

import com.example.soap.models.login.LoginResp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetFullPartyByGLNResponse")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetFullPartyByGLNResponse {
    @XmlElement(name = "return")
    private GetFullPartyByGLNResp resp;
}
