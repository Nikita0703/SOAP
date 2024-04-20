package com.example.soap.models.headers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "apiHeaderRequest", propOrder = {
        "sessiontoken"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiHeaderRequest {

    @XmlElement(name = "sessiontoken", nillable = true)
    private String sessiontoken;

}
