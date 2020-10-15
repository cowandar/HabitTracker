package Data;

import Entities.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



public class WriteToJson {


    WriteToJson(){
    }


    public static void writeToJson(User user) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/test/java/Resources/TestJsonDocument");
        mapper.writeValue(new FileOutputStream(file),  user);

//        mapper.writeValue(file), User.habitList);
        //TODO TEST THIS
    }
}
