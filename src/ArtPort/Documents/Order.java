package ArtPort.Documents;

import ArtPort.Catalog.*;

import java.util.ArrayList;
import java.util.Date;

public class Order extends BaseDocument {

    private int idOrder;
    private Date orderDate;
    private Vehicle vehicle;
    private Customer customer;
    private Driver driver;
    private Storage storage;

    private ArrayList<Good> goodList;

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
