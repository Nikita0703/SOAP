package com.example.soap.models.login;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum LoginEnum {
    @XmlEnumValue("OK")
    OK,

    @XmlEnumValue("INVALID_USERNAME")
    INVALID_USERNAME,

    @XmlEnumValue("INVALID_PASSWORD")
    INVALID_PASSWORD,

    @XmlEnumValue("INVALID_USERNAME_OR_PASSWORD")
    INVALID_USERNAME_OR_PASSWORD,

    @XmlEnumValue("NO_ACCESS")
    NO_ACCESS,
}
