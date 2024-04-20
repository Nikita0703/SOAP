package com.example.soap.models.responses;

import com.example.soap.models.entity.SimpleTradeItem;
import com.example.soap.models.enums.SearchPartiesByModifiedTimeEnum;
import com.example.soap.models.headers.ApiHeaderResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "searchSimpleTradeitemsByModifiedTimeResp")
@XmlType(propOrder = {
        "errorCode",
        "header",
        "totalRecordCount",
        "tradeitems"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchSimpleTradeItemsByModifiedTimeResp {
    @XmlElement(name = "errorCode",nillable = true)
    private SearchPartiesByModifiedTimeEnum errorCode;

    @XmlElement(name = "header",nillable = true)
    private ApiHeaderResponse header;

    @XmlElement(name = "totalRecordCount")
    private int totalRecordCount;

    @XmlElementWrapper(name = "tradeitems")
    @XmlElement(name = "simpleTradeitem")
    private List<SimpleTradeItem> tradeitems;


}
