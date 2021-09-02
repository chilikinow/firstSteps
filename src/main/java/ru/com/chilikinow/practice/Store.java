package ru.com.chilikinow.practice;

import com.fasterxml.jackson.annotation.*;

@JsonAutoDetect
public class Store {

    private String name;
    private String address;
    private City city;

    public Store(){}

    public Store(String name, String address, City city){
        this.name = name;
        this.address = address;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
