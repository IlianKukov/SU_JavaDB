package _02SpringData._03_ORMFund;

import _02SpringData._03_ORMFund.entities.User;
import _02SpringData._03_ORMFund.orm.Connector;
import _02SpringData._03_ORMFund.orm.EntityManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connector.createConnection("root", "12345", "db ");
        Connection connection = (Connection) Connector.getConnection();
        EntityManager<User> userManager = new EntityManager<>(connection);

        User user = new User("First", 28, LocalDate.now());

        userManager.presist(user);
    }
}
