package ArtPort.Documents;

import ArtPort.Interface.IDocument;

import java.util.Date;

public abstract class AbstractDocument implements IDocument {

    private Date dateTime;
    private char number;
    private boolean marked;
    private boolean posted;


    public AbstractDocument() { }

    public void onCopy(){ }

    public void beforeWrite(){}

    public void filling(){}

    public void beforeDelete(){}

}
