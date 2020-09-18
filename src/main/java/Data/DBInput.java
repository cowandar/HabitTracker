//package Data;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Map;
//
//public class DBInput {
//
//    JSONParser jsonParser = new JSONParser();
//
//
//    public DBInput(){
//        try {
//            DBConnection.connectToDB(DBConnection.mysqlTestUrl);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//
//    public void readFromJson(String relativeFilepath) throws IOException, ParseException, SQLException {
//        //Parsing the contents of the JSON File
//        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(relativeFilepath));
//        //Retrieving the Array
//        JSONArray jsonArray = (JSONArray) jsonObject.get("habits");
//        Connection con = DBConnection.connectToDB(DBConnection.mysqlTestUrl);
//        PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO testdb values (?,?,?)");
//
//        //getting values from JSON
//        for (Object object: jsonArray){
//            JSONObject record = (JSONObject) object;
//            String title = (String) record.get("TITLE");
//            String description = (String) record.get("Description");
//
//
//            JSONArray dailyChecklistArray = (JSONArray) jsonObject.get("dailyChecklist");
//            ArrayList<Boolean> dailyChecklist = new ArrayList<>();
//            for (Object days: dailyChecklistArray){
//                dailyChecklist.add(dailyChecklistArray.toString() );
//            }
//
//        //Setting values in mySQL DB
//            preparedStatement.setString(1, title);
//            preparedStatement.setString(2, description);
//            preparedStatement.setArray(3, dailyChecklist);
//            preparedStatement.execute();
//        }
//        System.out.println("Records inserted....");
//        System.out.println(preparedStatement);
//    }
//
//
//
//
//
//}
