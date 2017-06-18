package ArtPort.Catalog.Vehicle;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class VehicleDetails {

    private final StringProperty code;
    private final StringProperty idModel;
    private final StringProperty stateNumber;
    private final StringProperty description;

    public void setCode(String code) {
        this.code.set(code);
    }

    public void setIdModel(String idModel) {
        this.idModel.set(idModel);
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber.set(stateNumber);
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public String getCode() {
        return code.get();
    }

    public StringProperty codeProperty() {
        return code;
    }

    public String getIdModel() {
        return idModel.get();
    }

    public StringProperty idModelProperty() {
        return idModel;
    }

    public String getStateNumber() {
        return stateNumber.get();
    }

    public StringProperty stateNumberProperty() {
        return stateNumber;
    }

    public VehicleDetails(String  description,String  code,String  idModel,String  stateNumber){

        this.stateNumber = new SimpleStringProperty(stateNumber);
        this.idModel = new SimpleStringProperty(idModel);
        this.code = new SimpleStringProperty(code);
        this.description = new SimpleStringProperty(description);
    }

}
