package com.highmark.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Member")
public class Member implements Serializable {

    @Column(name = "activecoverageind")
    private String activeCoverageInd;
    @Column(name = "addressline1")
    private String addressLine1;
    @Column(name = "addressline2")
    private String addressLine2;
    @Column(name = "addressline3")
    private String addressLine3;
    @Column(name = "addressline4")
    private String addressLine4;
    @Column(name = "addresstypecode")
    private String addressTypeCode;
    @Column(name = "addresstypecodedescription")
    private String addressTypecodeDescription;
    @Column(name = "city")
    private String city;
    @Column(name = "countryname")
    private String countryName;
    @Column(name = "dateofbirth")
    private String dateOfBirth;
    @Column(name = "effectivedate")
    private String effectiveDate;
    @Column(name = "enddate")
    private String endDate;
    @Column(name = "extension")
    private String extension;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "group_number")
    private String groupNumber;
    @Column(name = "group_number_icis")
    private String groupNumberIcis;
    @Column(name = "group_phone_number")
    private String groupPhoneNumber;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "memberid")
    private String memberId;
    @Column(name = "middlename")
    private String middleName;
    @Column(name = "nameprefix")
    private String namePrefix;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @Column(name = "phonetype")
    private String phoneType;
    @Column(name = "sourcesystem")
    private String sourceSystem;
    @Column(name = "state")
    private String state;
    @Column(name = "taxid")
    private String taxId;
    @Column(name = "zipcode")
    private String zipCode;
    @Id
    @Column(name = "umi")
    private String umi;
    @Column(name = "member_relationship_to_policy_holder")
    private String memberRelationshipToPolicyHolder;
    @Column(name = "member_type")
    private String memberType;
    @Column(name = "plan_indicator")
    private String planIndicator;
}
