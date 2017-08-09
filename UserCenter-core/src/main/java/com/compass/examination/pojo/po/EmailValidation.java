package com.compass.examination.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class EmailValidation implements Serializable {
    private Long id;

    private Long tenantId;

    private String activeCode;

    private String activeMd5;

    private Date gmtExpire;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 6018502552875051026L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode == null ? null : activeCode.trim();
    }

    public String getActiveMd5() {
        return activeMd5;
    }

    public void setActiveMd5(String activeMd5) {
        this.activeMd5 = activeMd5 == null ? null : activeMd5.trim();
    }

    public Date getGmtExpire() {
        return gmtExpire;
    }

    public void setGmtExpire(Date gmtExpire) {
        this.gmtExpire = gmtExpire;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}