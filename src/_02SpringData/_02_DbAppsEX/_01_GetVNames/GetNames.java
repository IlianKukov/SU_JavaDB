package _02SpringData._02_DbAppsEX._01_GetVNames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class GetNames {
    private static final String GET_QUERY = "Select * from db";
    public static void main(String[] args) throws SQLException{
        final Connection connection = Utils.setSQLConnection();

        final PreparedStatement statement = connection.prepareStatement(GET_QUERY);

    }
}
