package ru.com.chilikinow.practice;

import org.junit.jupiter.api.Test;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.nio.file.Path;
import java.nio.file.Paths;

class XMLUnmarshalingTest {
    @Test
    void test() throws JAXBException {
        Path fileXML = Paths.get("src/main/resources/exampleXML.xml");
        JAXBContext context = JAXBContext.newInstance(Users.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Users users = (Users) unmarshaller.unmarshal(fileXML.toFile());
        System.out.println(users);
    }
}