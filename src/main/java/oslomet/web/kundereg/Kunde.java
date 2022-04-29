package oslomet.web.kundereg;

public class Kunde {
    private String navn;
    private String adresse;
    private String epost;
    public Kunde(String navn, String adresse, String epost) {
        this.navn = navn;
        this.adresse = adresse;
        this.epost = epost;
    }

    public Kunde(){
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
