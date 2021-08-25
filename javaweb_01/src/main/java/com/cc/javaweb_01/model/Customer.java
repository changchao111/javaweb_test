package com.cc.javaweb_01.model;

public class Customer {

    private long id;

    private String name;

    private String concact;

    private String telephone;

    private String email;

    private String remark;

    public Customer() {
    }

    public Customer(long id, String name, String concact, String telephone, String email, String remark) {
        this.id = id;
        this.name = name;
        this.concact = concact;
        this.telephone = telephone;
        this.email = email;
        this.remark = remark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConcact() {
        return concact;
    }

    public void setConcact(String concact) {
        this.concact = concact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
