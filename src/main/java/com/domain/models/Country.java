package com.domain.models;

import javax.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long countryId;
    @Column(name = "iso_code")
    private String isoCode;
    @Column(name = "country_name")
    private String productName;
    @Column(name = "country_capital")
    private String productLine;
    @Column(name = "country_independence_date")
    private String issueDate;
    @Column(name = "client_name")
    private String clientName;


    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getproductIssueDate() {
        return issueDate;
    }

    public void setProductIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getClientName() {
        return clientName;
    }
    
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

}
