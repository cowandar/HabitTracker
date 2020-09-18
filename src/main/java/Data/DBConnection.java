package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static final String mysqlUrl = "jdbc:mysql://localhost/habittable";
    public static final  String mysqlTestUrl = "jdbc:mysql://localhost/habittable";
    public static final String username = "root";
    public static final  String password = "pass";


    public static Connection connectToDB(String mysqlUrl) throws SQLException {

        // Registering the connection
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //Getting the connection
        Connection mysqlCon = DriverManager.getConnection(mysqlUrl, username, password);
        return mysqlCon;
    }

}
