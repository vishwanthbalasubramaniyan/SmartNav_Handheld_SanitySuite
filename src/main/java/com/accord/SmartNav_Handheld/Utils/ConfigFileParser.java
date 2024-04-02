package com.accord.SmartNav_Handheld.Utils;

import org.json.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConfigFileParser {

    public static JSONObject jsonParser(String filePath) throws IOException {
         String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
        return new JSONObject(jsonString);
    }
}
