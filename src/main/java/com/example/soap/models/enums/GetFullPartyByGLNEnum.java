package com.example.soap.models.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum GetFullPartyByGLNEnum {
    @XmlEnumValue("API_ERROR")
    API_ERROR,

    @XmlEnumValue("OK")
    OK,

    @XmlEnumValue("INVALID_GLN")
    INVALID_FROMDATE,

    @XmlEnumValue("GLN_NOT_EXIST")
    INVALID_TODATE,

}
