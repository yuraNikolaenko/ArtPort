package ArtPort;

import ArtPort.Catalog.Vehicle.Vehicle;

public class ManagedApplicationModule {


    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setStateNumber("AA1111BB");

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setStateNumber("AA2222BB");


        System.out.println(vehicle.getStateNumber());
        System.out.println(vehicle2.getStateNumber());


    }
}
