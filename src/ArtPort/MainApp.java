package ArtPort;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;


    public static void main(String[] args)

    {

        System.out.println("hello");
       // launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ArtPort");

        initRootLayout();

        //showVehicleList();

    }

//    public void showVehicleList() {
//
//        try {
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(MainApp.class.getResource("ArtPort/Catalog/Vehicle/ListForm.fxml"));
//            AnchorPane vehicleList = (AnchorPane) loader.load();
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayoutController.fxml"));
            rootLayout = (AnchorPane) loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();


        }
    }


}
