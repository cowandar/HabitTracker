package Data;


import Entities.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;

import java.io.IOException;


public class ReadFromJson {

    public static final ObjectMapper mapper = new ObjectMapper();

    public ReadFromJson(){

    }

    public void readJsonAndConvertToPOJO(String jsonPathname ) throws IOException {
        //Read Json file and convert to POJO
        FileInputStream fileInputStream = new FileInputStream(jsonPathname);
        mapper.readValue(fileInputStream, User.class);

        fileInputStream.close();
    }



}
