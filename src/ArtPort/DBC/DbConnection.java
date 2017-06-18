package ArtPort.DBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public Connection Connect() throws ClassNotFoundException {

        try {
        String url = "jdbc:sqlite:C://ArtPort/db/artport.db";
        String user = "";
        String password = "";

        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(url);
        return conn;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
