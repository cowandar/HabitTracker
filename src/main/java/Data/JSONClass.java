package Data;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;


import java.nio.file.Files;
import java.nio.file.Paths;


public class JSONClass {


    static String jsonFilepath = "C:\\Users\\GA1\\Desktop\\Workspace\\TSI\\src\\main\\java\\Data\\DataJSON";



    public static void writeToJson(String title, String description, boolean monday, boolean tuesday, boolean wednesday, boolean thursday, boolean friday, boolean saturday, boolean sunday) throws Exception {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("TITLE", title);
        jsonObject.put("Description", description);

        JSONArray dailyChecklist = new JSONArray();

        dailyChecklist.add(0,monday);
        dailyChecklist.add(1,tuesday);
        dailyChecklist.add(2,wednesday);
        dailyChecklist.add(3,thursday);
        dailyChecklist.add(4,friday);
        dailyChecklist.add(5,saturday);
        dailyChecklist.add(6,sunday);

        Files.write(Paths.get(jsonFilepath), jsonObject.toJSONString().getBytes());
    }

    public static void writeToJson(String title, String description) throws Exception {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("TITLE", title);
        jsonObject.put("Description", description);

        JSONArray dailyChecklist = new JSONArray();

        dailyChecklist.add(0,false);
        dailyChecklist.add(1,false);
        dailyChecklist.add(2,false);
        dailyChecklist.add(3,false);
        dailyChecklist.add(4,false);
        dailyChecklist.add(5,false);
        dailyChecklist.add(6,false);

        Files.write(Paths.get(jsonFilepath), jsonObject.toJSONString().getBytes());
    }
}
