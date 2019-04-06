package pl.wszib.domains;

public class Samochod {
    private String marka;
    private String model;
    private String rocznik;
    private String cena;
    private String pzrebiegKM;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRocznik() {
        return rocznik;
    }

    public void setRocznik(String rocznik) {
        this.rocznik = rocznik;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getPzrebiegKM() {
        return pzrebiegKM;
    }

    public void setPzrebiegKM(String pzrebiegKM) {
        this.pzrebiegKM = pzrebiegKM;
    }
}
