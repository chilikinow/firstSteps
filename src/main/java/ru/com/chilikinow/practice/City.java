package ru.com.chilikinow.practice;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class City {

    private String name;
    private int timeZone;

    public City() {}

    public City(String name, int timeZone) {
        this.name = name;
        this.timeZone = timeZone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(int timeZone) {
        this.timeZone = timeZone;
    }
}
