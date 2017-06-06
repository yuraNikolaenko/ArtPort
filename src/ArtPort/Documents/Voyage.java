package ArtPort.Documents;

import ArtPort.Catalog.Vehicle;

import java.util.ArrayList;
import java.util.Date;

public class Voyage extends AbstractDocument {

    private Vehicle vehicle;

    private ArrayList<Order> orderList;

    public Voyage() { }

    public void posting() {

    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
