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
@XmlType(name = "userpoolscontentPK", propOrder = {
        "username",
        "name",
        "globaltradeitemnumber",
        }
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPoolsContentPK {
    private String username;
    private String name;
    private Long globaltradeitemnumber;

}
