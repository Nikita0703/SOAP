package com.example.soap.models.requests;


import com.example.soap.models.headers.ApiHeaderRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "searchPartiesByModifiedTimeReq")
@XmlType(propOrder = {
        "fromDate",
        "header",
        "recordCount",
        "startRecord",
        "toDate"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchPartiesByModifiedTimeReq {

    @XmlElement(name = "fromDate",nillable = true)
    private XMLGregorianCalendar fromDate;

    @XmlElement(name = "header",nillable = true)
    private ApiHeaderRequest header;

    @XmlElement(name = "recordCount")
    private int recordCount;

    @XmlElement(name = "startRecord")
    private int startRecord;

    @XmlElement(name = "toDate",nillable = true)
    private XMLGregorianCalendar toDate;


}

