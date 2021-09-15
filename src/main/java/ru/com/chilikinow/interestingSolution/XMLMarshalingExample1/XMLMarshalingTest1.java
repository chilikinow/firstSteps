package ru.com.chilikinow.interestingSolution.XMLMarshalingExample1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.nio.file.Path;
import java.nio.file.Paths;

class XMLMarshalingTest1 {

    void test() throws JAXBException {

        Path XMLGetFile = Paths.get("src/main/resources/employees.xml");

        Path XMLSetFile = Paths.get("src/main/resources/employeesSet.xml");

        Employee employeePankaj = Employee.builder()
                .id(1)
                .age(29)
                .name("Pankaj")
                .gender("Male")
                .role("Java Developer")
                .build();
        Employee employeesLisa = Employee.builder()
                .id(2)
                .age(35)
                .name("Lisa")
                .gender("Female")
                .role("CEO")
                .build();
        Employees employees = Employees.builder()
                .employee(employeePankaj)
                .employee(employeesLisa)
                .build();

        JAXBContext context = JAXBContext.newInstance(Employees.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(employees, XMLSetFile.toFile());


    }
}