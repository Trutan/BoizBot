package de.boizbot.utils;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Config {
    
    public static Config loadConfigFile(String filename) {
        Config config = new Config();
        
        JSONObject json = null;
		try {
			json = (JSONObject) new JSONParser().parse(new FileReader(filename));
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(filename + " does not exist!");
			System.exit(1);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("Exception while parsing " + filename + "!");
			System.exit(1);
		}
        
        config.token = (String) json.get("token");
        
        return config;
    }
    
    private String token;

    private Config() {
    }

    public String getToken() {
        return token;
    }
}
