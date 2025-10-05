package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgres {
	private static final String URL = "jdbc:postgresql://localhost:5432/autopartsdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345678";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
