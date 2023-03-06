package _02SpringData._03_ORMFund.orm;

import java.sql.Connection;
import java.sql.SQLException;

public class EntityManager<E> implements DBContext<E> {
    private final Connection connection;

    public EntityManager(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean presist(E entity) throws SQLException {
        String tableName = this.getTableName(entity);
        String fieldist = this.getDBfields(entity);
        String valueList = this.getInserValues(entity);

        String sql = String.format("INSERT INTO %s (%s) VALUES (%s)",
                tableName, fieldist, valueList);

        return this.connection.prepareStatement(sql).execute();
    }

    @Override
    public Iterable find() {
        return null;
    }

    @Override
    public Iterable find(String where) {
        return null;
    }

    @Override
    public Iterable findFirst() {
        return null;
    }

    @Override
    public Iterable findFirst(String where) {
        return null;
    }
}
