package Data;

import Entities.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class WriteToJson {

    WriteToJson(){

    }


    public void OverwriteToJson(User user) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();


            String json = mapper.writeValueAsString((new User()));

            Files.write(new File("src/main/java/Data/DataJSON").toPath(), Arrays.asList(json), StandardOpenOption.CREATE);

    }
}
