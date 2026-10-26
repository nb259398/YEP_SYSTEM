package model;

public class Certificate {

    private int certificateId;
    private String certificateName;

    public Certificate() {
    }

    public Certificate(int certificateId, String certificateName) {
        this.certificateId = certificateId;
        this.certificateName = certificateName;
    }

    public int getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }
}