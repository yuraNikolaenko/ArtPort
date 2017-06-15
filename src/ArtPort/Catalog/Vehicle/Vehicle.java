package ArtPort.Catalog.Vehicle;

import ArtPort.Catalog.AbstractCatalog;

public class Vehicle extends AbstractCatalog implements ArtPort.Interface.IVehicle {

    private String stateNumber;

    public Vehicle() {

    }

    public Vehicle(String stateNumber) {
        this.setStateNumber(stateNumber);
    }


    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        return stateNumber != null ? stateNumber.equals(vehicle.stateNumber) : vehicle.stateNumber == null;
    }

    @Override
    public int hashCode() {
        return stateNumber != null ? stateNumber.hashCode() : 0;
    }


}

