package _02SpringData._02_DbAppsEX._01_GetVNames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static _02SpringData._02_DbAppsEX._01_GetVNames.Constants.*;

enum Utils {
    ;
     static Connection setSQLConnection() throws SQLException {
         final Properties properties = new Properties();

         properties.setProperty(USER_KEY, USER_VALUE);
         properties.setProperty(PASSWORD_KEY, PASSWORD_VALUE);
         return DriverManager.getConnection(JDBC_URL, properties);
     }

}
