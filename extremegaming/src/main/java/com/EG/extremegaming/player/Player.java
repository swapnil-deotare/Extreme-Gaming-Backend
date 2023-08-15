package com.EG.extremegaming.player;

import java.util.List;

public class Player {

    private String personId;
    private String name;
    private String phone;
    private float hoursPlayed;
    private List<String> friends;

    public Player(String personId, String name, String phone, float hoursPlayed, List<String> friends) {
        this.personId = personId;
        this.name = name;
        this.phone = phone;
        this.hoursPlayed = hoursPlayed;
        this.friends = friends;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getHoursPlayed() {
        return hoursPlayed;
    }

    public void setHoursPlayed(float hoursPlayed) {
        this.hoursPlayed = hoursPlayed;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
