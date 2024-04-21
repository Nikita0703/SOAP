package com.example.soap.models.responses;

import com.example.soap.models.entity.Party;
import com.example.soap.models.enums.GetFullPartyByGLNEnum;
import com.example.soap.models.headers.ApiHeaderResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetFullPartyByGLNResp")
@XmlType(propOrder = {
        "errorCode",
        "fullparty",
        "header",
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetFullPartyByGLNResp {
    @XmlElement(name = "errorCode",nillable = true)
    private GetFullPartyByGLNEnum errorCode;

    @XmlElement(name = "fullparty",nillable = true)
    private Party fullparty;

    @XmlElement(name = "header",nillable = true)
    private ApiHeaderResponse header;
}
