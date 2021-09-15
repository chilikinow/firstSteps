package ru.com.chilikinow.interestingSolution.JsonMarshaling;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JsonAutoDetect
@Data
@NoArgsConstructor
public class DataJson {
    private UUID id;
    private String firstName;
    private String secondName;
    private String middleName;
    private Integer age;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date birthDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Timestamp registrationTimestamp;
    private Boolean isPromotionsAllowed;
    private List<Contact> contacts;

}

@JsonAutoDetect
@Data
@NoArgsConstructor
class Contact{
    private String type;
    private String value;
}
