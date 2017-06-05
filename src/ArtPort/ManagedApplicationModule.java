package ArtPort;

import ArtPort.Documents.Order;
import ArtPort.Documents.Voyage;
import ArtPort.Interface.ICatalog;

import java.util.ArrayList;

public class ManagedApplicationModule {


    public static void main(String[] args) {



        Order order = new Order(1,"Order1");
        order.posting();
        System.out.println(order.getNameDocument());
        System.out.println(order.getIdClassDocument());

    }
}
