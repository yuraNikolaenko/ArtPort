package ArtPort.Documents;

import ArtPort.Catalog.*;

import java.util.ArrayList;

public class Order extends AbstractDocument {

    private Vehicle vehicle;
    private Customer customer;
    private Driver driver;
    private Storage storage;
    private ArrayList<Good> goodList;

    public Order() {
    }

    @Override
    public void posting(){
        System.out.println("order");
    }

}
