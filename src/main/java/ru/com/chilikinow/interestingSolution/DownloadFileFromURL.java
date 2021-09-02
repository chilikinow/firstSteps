package ru.com.chilikinow.interestingSolution;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class DownloadFileFromURL {

    public static void main(String[] args) throws IOException {
        URL downloadFileURL = new URL("http://cdn.onlinewebfonts.com/svg/img_47304.png");
        URLConnection urlConnection = downloadFileURL.openConnection();
        urlConnection.setRequestProperty("User-Agent", "Mozilla 5.0 (Windows; U; "
                + "Windows NT 5.1; en-US; rv:1.8.0.11) ");
        Path downloadFilePath = Paths.get("/Users/OlegChilikin/Desktop/1.png");
        if (!Files.exists(downloadFilePath))
            Files.createFile(downloadFilePath);
        try (InputStream inputStream = urlConnection.getInputStream()){
        Files.copy(inputStream, downloadFilePath, StandardCopyOption.REPLACE_EXISTING);
    }



    }
}


