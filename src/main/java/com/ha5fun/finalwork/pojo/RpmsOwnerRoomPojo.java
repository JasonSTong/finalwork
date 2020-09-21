package com.ha5fun.finalwork.pojo;

import java.util.Objects;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/21 8:29 下午
 */
@javax.persistence.Table(name = "RPMS_owner_room", schema = "finalwork", catalog = "")
public class RpmsOwnerRoomPojo {
    private Object ownerRoomId;
    private Object ownerId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "owner_room_id")
    public Object getOwnerRoomId() {
        return ownerRoomId;
    }

    public void setOwnerRoomId(Object ownerRoomId) {
        this.ownerRoomId = ownerRoomId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "owner_id")
    public Object getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Object ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RpmsOwnerRoomPojo that = (RpmsOwnerRoomPojo) o;
        return Objects.equals(ownerRoomId, that.ownerRoomId) &&
                Objects.equals(ownerId, that.ownerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerRoomId, ownerId);
    }
}
