package ArtPort.Documents;

public class Document {

    private int idDocument;
    private String nameDocument;

    public Document() {
    }

    public Document(int idDocument, String nameDocument) {
        this.idDocument = idDocument;
        this.nameDocument = nameDocument;
    }

    public Document(int idDocument) {
        this.idDocument = idDocument;
    }

    public Document(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public int getIdClassDocument() {
        return idDocument;
    }

    public void setIdClassDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public void posting(){
        System.out.println("Document posting");
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
