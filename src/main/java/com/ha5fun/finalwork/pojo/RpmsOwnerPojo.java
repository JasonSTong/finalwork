package com.ha5fun.finalwork.pojo;

import java.util.Objects;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/21 8:29 下午
 */
@javax.persistence.Table(name = "RPMS_owner", schema = "finalwork", catalog = "")
public class RpmsOwnerPojo {
    private Object ownerId;
    private String ownerName;
    private Object ownerSex;
    private String ownerNative;
    private String ownerPhone;
    private String ownerIden;
    private String ownerDep;
    private Object roleId;
    private int ownerDelete;

    @javax.persistence.Id
    @javax.persistence.Column(name = "owner_id")
    public Object getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Object ownerId) {
        this.ownerId = ownerId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "owner_name")
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "owner_sex")
    public Object getOwnerSex() {
        return ownerSex;
    }

    public void setOwnerSex(Object ownerSex) {
        this.ownerSex = ownerSex;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "owner_native")
    public String getOwnerNative() {
        return ownerNative;
    }

    public void setOwnerNative(String ownerNative) {
        this.ownerNative = ownerNative;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "owner_phone")
    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "owner_iden")
    public String getOwnerIden() {
        return ownerIden;
    }

    public void setOwnerIden(String ownerIden) {
        this.ownerIden = ownerIden;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "owner_dep")
    public String getOwnerDep() {
        return ownerDep;
    }

    public void setOwnerDep(String ownerDep) {
        this.ownerDep = ownerDep;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "role_id")
    public Object getRoleId() {
        return roleId;
    }

    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "owner_delete")
    public int getOwnerDelete() {
        return ownerDelete;
    }

    public void setOwnerDelete(int ownerDelete) {
        this.ownerDelete = ownerDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RpmsOwnerPojo that = (RpmsOwnerPojo) o;
        return ownerDelete == that.ownerDelete &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(ownerName, that.ownerName) &&
                Objects.equals(ownerSex, that.ownerSex) &&
                Objects.equals(ownerNative, that.ownerNative) &&
                Objects.equals(ownerPhone, that.ownerPhone) &&
                Objects.equals(ownerIden, that.ownerIden) &&
                Objects.equals(ownerDep, that.ownerDep) &&
                Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, ownerName, ownerSex, ownerNative, ownerPhone, ownerIden, ownerDep, roleId, ownerDelete);
    }
}
