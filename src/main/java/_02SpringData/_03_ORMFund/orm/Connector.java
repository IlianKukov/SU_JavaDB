package _02SpringData._03_ORMFund.orm;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connector {
    private static Connector connection;
    private static final String jdbc = "jdbc:mysql://localhost:3306/%s";
//    private Connerctor(){} // Singleton design pattern

    public static void createConnection(String user, String password, String dbName) throws SQLException {
        Properties props = new Properties();
        props.setProperty("user", user);
        props.setProperty("password", password);

        String formattedJdbc = String.format(jdbc, dbName);

      connection = (Connector) DriverManager.getConnection(formattedJdbc, props);
    }
    public static Connector getConnection(){
//        if (connection==null){ // Singleton design pattern
//            create();
//        }
        return connection;
    }

    private static boolean isConnectionAvailable(){
        return connection!= null;
    }

}
