package ArtPort.Catalog;

import ArtPort.Interface.ICatalog;

public class AbstractCatalog implements ICatalog {

    private String nameCatalog;

    public void onWrite(){ }

    public void onCopy(){ }

    public void beforeWrite(){}

    public void filling(){}

    public void beforeDelete(){}

}
