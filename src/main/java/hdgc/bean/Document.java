package hdgc.bean;

public class Document {
    private Integer id;

    private String documentName;

    private String documentContent;

    private String documentEvaluation;

    private Long userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName == null ? null : documentName.trim();
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent == null ? null : documentContent.trim();
    }

    public String getDocumentEvaluation() {
        return documentEvaluation;
    }

    public void setDocumentEvaluation(String documentEvaluation) {
        this.documentEvaluation = documentEvaluation == null ? null : documentEvaluation.trim();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}