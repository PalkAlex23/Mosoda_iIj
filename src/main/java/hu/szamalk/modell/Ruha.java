package hu.szamalk.modell;

public class Ruha {
    private String tulaj;
    private boolean tiszta;

    public Ruha(String tulaj) {
        this(tulaj, false);
    }

    public Ruha(String tulaj, boolean tiszta) {
        this.tulaj = tulaj;
        this.tiszta = tiszta;
    }

    public String getTulaj() {
        return tulaj;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    @Override
    public String toString() {
        return "Ruha{" +
                "tulaj='" + tulaj + '\'' +
                ", tiszta=" + tiszta +
                '}';
    }
}
