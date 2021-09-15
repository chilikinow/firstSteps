package ru.com.chilikinow.interestingSolution.JsonMarshaling;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

class PracticeWIthJson {

    public void parseTest() throws IOException{
        Path fileJson = Paths.get("src/main/resources/data.json");
        ObjectMapper mapper = JsonMapper.builder()
                .findAndAddModules()
                .build();
        DataJson dataJson = mapper.readValue(fileJson.toFile(), DataJson.class);

        System.out.println(dataJson);

        Path finalFileJson = Paths.get("src/main/resources/final_data.json");
        mapper = JsonMapper.builder()
                .findAndAddModules()
                .build();

        mapper.writeValue(finalFileJson.toFile(), dataJson);
    }
}