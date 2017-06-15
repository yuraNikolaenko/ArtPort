package ArtPort.Catalog;

import ArtPort.Interface.ICatalog;

public abstract class AbstractCatalog implements ICatalog {

    private String nameCatalog;

    private int code;
    private char description;
    private boolean marked;
    private char idCatalog;
    private char idParent;


    public void onWrite(){ }
    public void onCopy(){ }
    public void beforeWrite(){}
    public void filling(){}
    public void beforeDelete(){}

    public String getNameCatalog() {
        return nameCatalog;
    }

    public void setNameCatalog(String nameCatalog) {
        this.nameCatalog = nameCatalog;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public char getDescription() {
        return description;
    }

    public void setDescription(char description) {
        this.description = description;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public char getIdCatalog() {
        return idCatalog;
    }

    public void setIdCatalog(char idCatalog) {
        this.idCatalog = idCatalog;
    }

    public char getIdParent() {
        return idParent;
    }

    public void setIdParent(char idParent) {
        this.idParent = idParent;
    }
}
