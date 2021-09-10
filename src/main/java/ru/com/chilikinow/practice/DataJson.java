package ru.com.chilikinow.practice;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JsonAutoDetect
public class DataJson {
    @Getter @Setter private UUID id;
    @Getter @Setter private String firstName;
    @Getter @Setter private String secondName;
    @Getter @Setter private String middleName;
    @Getter @Setter private Integer age;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    @Getter @Setter private Date birthDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Getter @Setter private Timestamp registrationTimestamp;
    @Getter @Setter private Boolean isPromotionsAllowed;
    @Getter @Setter private List<Contact> contacts;

    public DataJson() {
    }

    public DataJson(UUID id, String firstName, String secondName, String middleName, Integer age, Date birthDate, Timestamp registrationTimestamp, Boolean isPromotionsAllowed, List<Contact> contacts) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.age = age;
        this.birthDate = birthDate;
        this.registrationTimestamp = registrationTimestamp;
        this.isPromotionsAllowed = isPromotionsAllowed;
        this.contacts = contacts;
    }

}

@JsonAutoDetect
class Contact{
    private String type;
    private String value;

    public Contact(){
    }

    public Contact(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
