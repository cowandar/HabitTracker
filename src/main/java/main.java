import Display.*;
import Data.*;


import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {

        ToConsole toConsole = new ToConsole();

        ReadFromJson readFromJson1 = new ReadFromJson();
        readFromJson1.readJsonAndConvertToPOJO("src/main/test/java/Resources/TestJsonDocument");
        toConsole.welcome();
        toConsole.mainMenu();


    }
}
