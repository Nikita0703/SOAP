package com.example.soap.models.headers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "apiHeaderResponse", propOrder = {
        "errorCode",
        "sessiontoken"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiHeaderResponse {

    @XmlElement(name = "errorCode", nillable = true)
    private String errorCode;

    @XmlElement(name = "sessiontoken", nillable = true)
    private String sessiontoken;

}
