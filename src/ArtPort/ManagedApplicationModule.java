package ArtPort;

import ArtPort.Documents.Order;
import ArtPort.Documents.Voyage;

public class ManagedApplicationModule {

    public static void main(String[] args) {

        Order order = new Order();
        System.out.println("order = " + order);

        Voyage voyage = new Voyage();
        System.out.println("voyage = " + voyage);

    }
}
