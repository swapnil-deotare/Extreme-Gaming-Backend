package com.EG.extremegaming.booking;

import java.util.Date;
import java.util.UUID;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Booking {

    @DynamoDBAttribute
    private String bookingId;

    @DynamoDBAttribute
    private String startTime;

    @DynamoDBAttribute
    private String endTime;

    @DynamoDBAttribute
    private int numberOfPlayers;

    @DynamoDBAttribute
    private String type;

    public Booking(int numberOfPlayers, String startTime, String endTime,
            String type) {
        this.bookingId = UUID.randomUUID().toString();
        this.numberOfPlayers = numberOfPlayers;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
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
