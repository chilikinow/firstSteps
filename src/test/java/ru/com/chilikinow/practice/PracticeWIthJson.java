package ru.com.chilikinow.practice;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

class PracticeWIthJson {

    @Test
    public void parseTest() throws JAXBException, ParserConfigurationException, IOException, SAXException {
        Path fileJson = Paths.get("src/main/resources/data.json");
        ObjectMapper mapper = JsonMapper.builder()
                .findAndAddModules()
                .build();
        DataJson dataJson = mapper.readValue(fileJson.toFile(), DataJson.class);
        System.out.println(dataJson);




    }

}

//examples


//    Path fileXML = Paths.get("src/main/resources/data.json");
//
//    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//    DocumentBuilder builder = factory.newDocumentBuilder();
//    Document document = builder.parse(fileXML.toFile());
//
//    Element rootElement = document.getDocumentElement();
//    NodeList nodeList = rootElement.getChildNodes();
//        for (int i = 0; i < nodeList.getLength(); i++) {
//        System.out.println(nodeList.item(i).getNodeName());
//        }


//        //писать результат сериализации будем в Writer(StringWriter)
//        StringWriter writer = new StringWriter();
//
//        //создание объекта Marshaller, который выполняет сериализацию
//        JAXBContext context = JAXBContext.newInstance(Store.class);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        // сама сериализация
//        marshaller.marshal(store, writer);
//
//        //преобразовываем в строку все записанное в StringWriter
//        String result = writer.toString();
//
//        System.out.println(result);