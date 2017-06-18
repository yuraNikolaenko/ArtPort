package ArtPort;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;


public class MainApp extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;

    public static void main(String[] args)

    {
       launch(args);
    }

    private static void initDBC() {

        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;

        try {
            Driver driver = (Driver) Class.forName("org.sqlite.JDBC").newInstance();
            String url = "jdbc:sqlite:C://ArtPort/db/artport.db";
            con = DriverManager.getConnection(url);

            String sql = "SELECT  * FROM  vehicle";

            stmt = con.createStatement();
            res = stmt.executeQuery(sql);
            while (res.next()) {
                System.out.println(res.getString("description") + " " + res.getObject("code"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (res != null) res.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception ex) {
            }
        }
    }

    @Override
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ArtPort");

        initRootLayout();

    }

    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("Catalog\\Vehicle\\ListForm.fxml"));
            rootLayout = (AnchorPane) loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }


}
