package com.example.soap.models.enums;


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum SearchPartiesByModifiedTimeEnum {

    @XmlEnumValue("API_ERROR")
    API_ERROR,

    @XmlEnumValue("OK")
    OK,

    @XmlEnumValue("INVALID_FROMDATE")
    INVALID_FROMDATE,

    @XmlEnumValue("INVALID_TODATE")
    INVALID_TODATE,

    @XmlEnumValue("INVALID_RECORD_COUNT")
    INVALID_RECORD_COUNT,

    @XmlEnumValue("INVALID_START_RECORD")
    INVALID_START_RECORD,

    @XmlEnumValue("NO_RESULTS")
    NO_RESULTS;
}
