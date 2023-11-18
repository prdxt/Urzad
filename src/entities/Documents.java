package entities;

public class Documents {
    private String documentType;
    private String documentContent;

    public Documents(String documentType, String documentContent) {
        this.documentType = documentType;
        this.documentContent = documentContent;
    }


    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }
}

