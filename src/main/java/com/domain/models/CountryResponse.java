package com.domain.models;

public class CountryResponse {
    private String productName;
    public String productLine;
    public String productIssueDate;
    public String clientName;
    /* 
    public int yearsOfIndependency;
    public int monthsOfIndependency;
    public int dayssOfIndependency;
    */
    public String getProductName() {
        return productName;
    }

     public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }
    public void setIssueDate(String productIssueDate) {
        this.productIssueDate = productIssueDate;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    /* 
    public void setYearsOfIndependency(int yearsOfIndependency) {
        this.yearsOfIndependency = yearsOfIndependency;
    }
    public void setMonthsOfIndependency(int monthsOfIndependency) {
        this.monthsOfIndependency = monthsOfIndependency;
    }
    public void setDayssOfIndependency(int dayssOfIndependency) {
        this.dayssOfIndependency = dayssOfIndependency;
    }
    */
}