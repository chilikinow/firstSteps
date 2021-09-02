package ru.com.chilikinow.practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

class StoreTestConverterToJson {

    @Test
    public void testStoreCreated() throws IOException, ParseException {

        Path fileJson = Paths.get("src/main/resources/dataJson.json");

        //Json Simple

        JSONObject objectRoot = (JSONObject) new JSONParser().parse(new FileReader(fileJson.toFile()));

        JSONObject objectAuthorizationBot = (JSONObject) objectRoot.get("authorizationBot");
        String userNameAuthorization = (String) objectAuthorizationBot.get("userName");
        String tokenAuthorization = (String) objectAuthorizationBot.get("token");

        JSONObject objectBonusCardSystem = (JSONObject) objectRoot.get("bonusCardSystem");
        String uriBonusCardSystem = (String) objectBonusCardSystem.get("uri");
        String userNameBonusCardSystem = (String) objectBonusCardSystem.get("userName");
        String passwordBonusCardSystem = (String) objectBonusCardSystem.get("password");

        //JsonPath

        String readUriPromoInfoFile = JsonPath.read(fileJson.toFile(), "$.promoInfoFile.readUri");
        String downloadFileUriPromoInfoFile = JsonPath.read(fileJson.toFile(), "$.promoInfoFile.downloadFileUri");
        System.out.println(readUriPromoInfoFile);
        System.out.println(downloadFileUriPromoInfoFile);


    }
}