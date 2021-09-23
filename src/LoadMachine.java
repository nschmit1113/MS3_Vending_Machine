package src;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
/**
 * This class will be responsible for loading the vending machine with the
 * items from the JSON file. 
 */

public class LoadMachine {

    public LoadMachine(){

    }

    public void readInJson(){
        JSONParser jP = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) jP.parse(new FileReader("../input.json"));
            //String id = (String) jsonObject.get("ID"); example
            JSONObject ob = (JSONObject)jsonObject.get("config");
            int rows = (int)ob.get("rows");
            int cols = (int)ob.get("columns");
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
