package oslomet.web.kundereg;

public class Bil {
    private String merke;
    private String modell;

    public Bil(){}

    public Bil(String merke, String modell){
        this.merke = merke;
        this.modell = modell;
    }

    public String getMerke() {
        return merke;
    }

    public String getModell() {
        return modell;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}
