package hu.szamalk.modell;

public class Ing extends Ruha {
    private double szinintezitas;

    public Ing(String tulaj, double szinintezitas) {
        super(tulaj);
        this.szinintezitas = szinintezitas;
    }

    public Ing(String tulaj, boolean tiszta, double szinintezitas) {
        super(tulaj, tiszta);
        this.szinintezitas = 100;
    }

    public double getSzinintezitas() {
        return szinintezitas;
    }

    public void setTiszta(boolean tiszta) {
        super.setTiszta(tiszta);
        szinintezitas *= 0.97;
    }

    @Override
    public String toString() {
        return super.toString() + " <|--- Ing{" +
                "szinintezitas='" + szinintezitas + '\'' +
                '}';
    }
}
