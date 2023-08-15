package com.EG.extremegaming.booking;

import java.util.Date;
import java.util.List;

public class Booking {

    private String bookingId;
    private String personName;
    private List<String> friends;
    private Date startTime;
    private Date endTime;
    private String type;

    public Booking(String bookingId, String personName, List<String> friends, Date startTime, Date endTime,
            String type) {
        this.bookingId = bookingId;
        this.personName = personName;
        this.friends = friends;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
