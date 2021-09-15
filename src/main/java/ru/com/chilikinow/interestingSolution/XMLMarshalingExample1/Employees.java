package ru.com.chilikinow.interestingSolution.XMLMarshalingExample1;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employees {
    @Singular
    private List<Employee> employees;

     public List<Employee> getEmployees() {
        return employees;
    }

    @XmlElement
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

@AllArgsConstructor
@NoArgsConstructor
@Builder
class Employee {
    private int id;
    private int age;
    private String name;
    private String gender;
    private String role;

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public void setGender(String gender) {
        this.gender = gender;
    }

    @XmlElement
    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRole() {
        return role;
    }
}