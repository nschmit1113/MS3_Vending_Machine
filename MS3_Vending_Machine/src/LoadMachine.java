package MS3_Vending_Machine.src;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
/**
 * This class will be responsible for loading the vending machine with the
 * items from the JSON file. 
 */

public class LoadMachine {

    private int rows = 0;
    private int cols = 0;

    public LoadMachine(String fileName){
        readInJson(fileName);
    }

    public void readInJson(String fileName){
        JSONParser jP = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) jP.parse(new FileReader(fileName));
            //String id = (String) jsonObject.get("ID"); example
            JSONObject ob = (JSONObject)jsonObject.get("config");
            rows = (int)ob.get("rows");
            cols = (int)ob.get("columns");

        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }

    public int rows(){
        return rows;
    }

    public int cols(){
        return cols;
    }
}
