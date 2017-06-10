package ArtPort.Catalog;

import ArtPort.Interface.ICatalog;

public abstract class AbstractCatalog implements ICatalog {

    private String nameCatalog;

    private int code;
    private char description;
    private boolean marked;
    private char idCatalog;

    public void onWrite(){ }
    public void onCopy(){ }
    public void beforeWrite(){}
    public void filling(){}
    public void beforeDelete(){}

}
