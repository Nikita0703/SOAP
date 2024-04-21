package com.example.soap.models.login;

import com.example.soap.models.headers.ApiHeaderResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "loginResp", propOrder = {
        "loginEnum",
        "header"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResp {
    private LoginEnum loginEnum;
    private ApiHeaderResponse header;
}
