package ArtPort.Documents;

public class BaseDocument {

    private int idDocument;
    private String nameDocument;

    public BaseDocument() {
    }

    public BaseDocument(int idDocument, String nameDocument) {
        this.idDocument = idDocument;
        this.nameDocument = nameDocument;
    }

    public BaseDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public BaseDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public int getIdClassDocument() {
        return idDocument;
    }

    public void setIdClassDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public void posting(){
        System.out.println("BaseDocument posting");
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
