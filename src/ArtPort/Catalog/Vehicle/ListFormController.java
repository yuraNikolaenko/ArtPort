package ArtPort.Catalog.Vehicle;

import ArtPort.DBC.DbConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.*;


import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ResourceBundle;


public class ListFormController implements Initializable {

    @FXML
    public TreeView <String> treeView;
    @FXML
    private Label label;
    @FXML
    private TableView<VehicleDetails> tableVehilce;
    @FXML
    private TableColumn<VehicleDetails,String> columnName;
    @FXML
    private TableColumn<VehicleDetails,String> columnDescription;
    @FXML
    private TableColumn<VehicleDetails,String> columnModel;
    @FXML
    private TableColumn<VehicleDetails,String> columnStateNumber;
    @FXML
    private Button btnLoad;

    private ObservableList<VehicleDetails> data;
    private DbConnection dc;

    Image icon = new Image(getClass().getResourceAsStream("/resource/folder.png"));

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        dc = new DbConnection();
        Connection conn = null;
        try {
            conn = dc.Connect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        data= FXCollections.observableArrayList();
        try {
            ResultSet res;
            res = conn.createStatement().executeQuery("SELECT vehicle.description,vehicle.code,vehicle.stateNumber, m1.description FROM vehicle LEFT JOIN model m1 ON vehicle.idModel=m1.idModel WHERE NOT vehicle.folder");
            while (res.next()){
                data.add(new VehicleDetails(res.getString(1),res.getString(2),res.getString(4),res.getString(3)));
            }
            columnName.setCellValueFactory(new PropertyValueFactory<>("code"));
            columnDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
            columnModel.setCellValueFactory(new PropertyValueFactory<>("idModel"));
            columnStateNumber.setCellValueFactory(new PropertyValueFactory<>("stateNumber"));

            tableVehilce.setItems(null);
            tableVehilce.setItems(data);


        } catch (SQLException e) {
            e.printStackTrace();
        }

        TreeItem<String> root = new TreeItem<>("Vehicle",new ImageView(icon));
        root.setExpanded(true);

        TreeItem<String> nodeA = new TreeItem<>("Own");
        TreeItem<String> nodeB = new TreeItem<>("Hired");
        root.getChildren().addAll(nodeA,nodeB);

        treeView.setRoot(root);

    }
}
