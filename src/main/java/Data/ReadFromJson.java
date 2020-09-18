package Data;


import Entities.Habit;
import Entities.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Arrays;

public class ReadFromJson {

    public static final ObjectMapper mapper = new ObjectMapper();

    public ReadFromJson() throws IOException {

    }

    public void readJsonAndConvertToPOJO(String jsonPathname ) throws IOException {
        //Read Json file and convert to POJO
        FileInputStream fileInputStream = new FileInputStream(jsonPathname);
        User user = mapper.readValue(fileInputStream, User.class);
        fileInputStream.close();
    }



}
