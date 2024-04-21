package com.example.soap.models.responses;

import com.example.soap.models.enums.SearchPartiesByModifiedTimeEnum;
import com.example.soap.models.headers.ApiHeaderResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "searchPartiesByModifiedTimeResp")
@XmlType(propOrder = {
        "errorCode",
        "header",
        "parties",
        "totalRecordCount"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchPartiesByModifiedTimeResp {

    @XmlElement(name = "errorCode",nillable = true)
    private SearchPartiesByModifiedTimeEnum errorCode;

    @XmlElement(name = "header",nillable = true)
    private ApiHeaderResponse header;

    @XmlElement(name = "parties")
    private List<Long> parties;

    @XmlElement(name = "totalRecordCount")
    private int totalRecordCount;

}

