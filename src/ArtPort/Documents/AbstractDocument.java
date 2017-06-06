package ArtPort.Documents;

import ArtPort.Interface.IDocument;

import java.util.Date;

public abstract class AbstractDocument implements IDocument {

    private Date dateTime;
    private String number;
    private boolean marked;
    private boolean posted;

    public static int documentCost;

    public AbstractDocument() {}

    public void checkDocument(){documentCost++;}

    public void onCopy(){ }

    public void beforeWrite(){}

    public void filling(){}

    public void beforeDelete(){}


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
