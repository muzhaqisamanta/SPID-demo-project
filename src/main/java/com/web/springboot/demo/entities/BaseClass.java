package com.web.springboot.demo.entities;

import com.web.springboot.demo.entities.enums.SpidStatus;

import java.util.Date;

public class BaseClass {private Long id;
    private Date createdAt;
    private String createdBy;

    public BaseClass(){

    }
    public BaseClass(Long id, Date createdAt, String createdBy) {
        this.id = id;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
