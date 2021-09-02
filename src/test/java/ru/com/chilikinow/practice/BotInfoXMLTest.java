package ru.com.chilikinow.practice;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

class BotInfoXMLTest {

    @Test
    public void unSerializableTest() throws IOException, JAXBException, ParserConfigurationException, SAXException, XPathExpressionException {
        Path fileXML = Paths.get("/Users/OlegChilikin/IdeaProjects/promoBot/src/main/resources/botData.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(fileXML.toFile());

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = XPathFactory.newInstance().newXPath();
        System.out.println(xPath.evaluate("/bot_info/authorization_bot", document));
    }

}