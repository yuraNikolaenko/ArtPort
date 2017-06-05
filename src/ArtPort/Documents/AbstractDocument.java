package ArtPort.Documents;

import ArtPort.Interface.IDocument;

public abstract class AbstractDocument implements IDocument {

    private int idDocument;
    private String nameDocument;

    public AbstractDocument() { }

    public AbstractDocument(int idDocument, String nameDocument) {
        this.idDocument = idDocument;
        this.nameDocument = nameDocument;
    }

    public AbstractDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public AbstractDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public int getIdClassDocument() {
        return idDocument;
    }

    public void setIdClassDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public void onCopy(){ }

    public void beforeWrite(){}

    public void filling(){}

    public void beforeDelete(){}

    public String getNameDocument() {
        return nameDocument;
    }

    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }
}
