package ArtPort.Documents;

import ArtPort.Catalog.Vehicle;

import java.util.ArrayList;
import java.util.Date;

public class Voyage extends AbstractDocument {

    private int idVoyage;
    private Date orderDate;
    private Vehicle vehicle;

    private ArrayList<Order> orderList;

    public Voyage() { }

    public void posting() {

    }

    public int getIdVoyage() {
        return idVoyage;
    }

    public void setIdVoyage(int idVoyage) {
        this.idVoyage = idVoyage;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
