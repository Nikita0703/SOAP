package com.example.soap.models.requests;

import com.example.soap.models.headers.ApiHeaderRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getFullPartyByGLNReq")
@XmlType(propOrder = {
        "gln",
        "header"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetFullPartyByGLNReq {
    @XmlElement(name = "gln",nillable = true)
    private Long gln;

    @XmlElement(name = "header",nillable = true)
    private ApiHeaderRequest header;
}
