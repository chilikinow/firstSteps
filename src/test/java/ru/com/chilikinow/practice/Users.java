package ru.com.chilikinow.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Users {
    private List<User> userList;

    @XmlElement(name = "user")
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
class User{
    private int id;
    private String name;
    private String familyName;
    private int age;
    private String sex;
    private Contacts contacts;

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name = "family_name")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }
    @XmlElement
    public void setSex(String sex) {
        this.sex = sex;
    }
    @XmlElement
    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }
}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
class Contacts{
    private List<Contact> contacts;

    @XmlElement(name = "contact")
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
class Contact{
    private boolean defaultBoolean;
    private String type;
    private String value;

    @XmlAttribute(name = "default")
    public void setDefaultBoolean(boolean defaultBoolean) {
        this.defaultBoolean = defaultBoolean;
    }
    @XmlElement
    public void setType(String type) {
        this.type = type;
    }
    @XmlElement
    public void setValue(String value) {
        this.value = value;
    }
}
