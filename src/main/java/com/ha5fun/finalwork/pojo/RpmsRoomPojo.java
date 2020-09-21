package com.ha5fun.finalwork.pojo;

import java.sql.Date;
import java.util.Objects;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/21 8:29 下午
 */
@javax.persistence.Table(name = "RPMS_room", schema = "finalwork", catalog = "")
public class RpmsRoomPojo {
    private Object roomId;
    private String roomName;
    private Date roomDate;
    private String roomType;
    private String roomUse;
    private double roomArea;
    private double roomPercent;
    private Object roomDelete;

    @javax.persistence.Id
    @javax.persistence.Column(name = "room_id")
    public Object getRoomId() {
        return roomId;
    }

    public void setRoomId(Object roomId) {
        this.roomId = roomId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "room_name")
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "room_date")
    public Date getRoomDate() {
        return roomDate;
    }

    public void setRoomDate(Date roomDate) {
        this.roomDate = roomDate;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "room_type")
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "room_use")
    public String getRoomUse() {
        return roomUse;
    }

    public void setRoomUse(String roomUse) {
        this.roomUse = roomUse;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "room_area")
    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "room_percent")
    public double getRoomPercent() {
        return roomPercent;
    }

    public void setRoomPercent(double roomPercent) {
        this.roomPercent = roomPercent;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "room_delete")
    public Object getRoomDelete() {
        return roomDelete;
    }

    public void setRoomDelete(Object roomDelete) {
        this.roomDelete = roomDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RpmsRoomPojo that = (RpmsRoomPojo) o;
        return Double.compare(that.roomArea, roomArea) == 0 &&
                Double.compare(that.roomPercent, roomPercent) == 0 &&
                Objects.equals(roomId, that.roomId) &&
                Objects.equals(roomName, that.roomName) &&
                Objects.equals(roomDate, that.roomDate) &&
                Objects.equals(roomType, that.roomType) &&
                Objects.equals(roomUse, that.roomUse) &&
                Objects.equals(roomDelete, that.roomDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, roomName, roomDate, roomType, roomUse, roomArea, roomPercent, roomDelete);
    }
}
