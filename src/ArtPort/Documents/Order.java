package ArtPort.Documents;

import ArtPort.Catalog.Customer;
import ArtPort.Catalog.Driver;
import ArtPort.Catalog.Storage;
import ArtPort.Catalog.Vehicle;

import java.util.Date;

public class Order extends Document{

    private int idOrder;
    private Date orderDate;
    private Vehicle vehicle;
    private Customer customer;
    private Driver driver;
    private Storage storage;

    public Order() {
    }

    public Order(int idDocument, String nameDocument) {
        super(idDocument, nameDocument);
    }

    @Override
    public void posting(){

        System.out.println("Order posting");
    }
    public  void test(){}
}
