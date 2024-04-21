package com.example.soap.models.login;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "loginReq", propOrder = {
        "password",
        "username",
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginReq {
    private String password;
    private String username;
}
