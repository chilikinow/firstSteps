package ru.com.chilikinow.practice;

import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

class StoreTestConverterToXML {

    @Test
    public void storeTestXMLConverter() throws JAXBException {

        City moscow = new City("Moscow", 3);
        Store store = new Store("Tverskaya", "Tverskaya St. 22", moscow);

        //писать результат сериализации будем в Writer(StringWriter)
        StringWriter writer = new StringWriter();

        //создание объекта Marshaller, который выполняет сериализацию
        JAXBContext context = JAXBContext.newInstance(Store.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // сама сериализация
        marshaller.marshal(store, writer);

        //преобразовываем в строку все записанное в StringWriter
        String result = writer.toString();

        System.out.println(result);
    }

}