package com.example.soap.models.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "LoginResponse")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    @XmlElement(name = "return")
    private LoginResp ret;
}
