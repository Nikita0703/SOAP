package com.example.soap.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "poolscontent", propOrder = {
        "name",
        "globaltradeitemnumber",
        "username"}
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoolsContentPK {
    private String name;
    private Long globaltradeitemnumber;
    private String username;


}
