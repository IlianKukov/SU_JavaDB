package _02SpringData._02_DbAppsEX._01_GetVNames;

import java.sql.*;
import java.util.Properties;

public class GetNames {
    private static final String GET_QUERY = "Select * from db";
    private static final String COLUMN_LABEL_NAME = "Select * from db";
    private static final int COLUMN_COUNT = 3;
    private static final String PRINT_FORMAT = "%s - %d%n";
    public static void main(String[] args) throws SQLException{
        final Connection connection = Utils.setSQLConnection();

        final PreparedStatement statement = connection.prepareStatement(GET_QUERY);
        statement.setInt(1,15);

        final ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){
            final String viliansNames = resultSet.getString(COLUMN_LABEL_NAME);
            final int minionsCount = resultSet.getInt(COLUMN_COUNT);
            System.out.printf(PRINT_FORMAT,viliansNames, minionsCount);
        }
        connection.close();
    }
}
