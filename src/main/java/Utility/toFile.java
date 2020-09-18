package Utility;

import java.io.FileWriter;
import java.io.IOException;

public class toFile {

     String filePath ="C:\\Users\\GA1\\Desktop\\Workspace\\TSI\\src\\main\\java\\Data\\DataJSON";
     static FileWriter toFile; //TODO ensure there is only one instance of toFile FileWriter

    static {
        try {
            toFile = new FileWriter(
                    "C:\\Users\\GA1\\Desktop\\Workspace\\TSI\\src\\main\\java\\Data\\DataJSON"
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public toFile() {
        filePath =
                "C:\\Users\\GA1\\Desktop\\Workspace\\TSI\\src\\main\\java\\Data\\DataJSON";
    }

    public void writeToFile(String contents) throws IOException {
        toFile.write(contents);
    }
}
