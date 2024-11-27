package hu.szamalk.modell;

import java.util.Objects;

public class Mosoda {
    private final Ruha[] ruhak;
    private int szamlal = 0;

    public Mosoda() {
        this(5);
    }

    public Mosoda(int db) {
        this(new Ruha[db]);
    }

    public Mosoda(Ruha[] ruhak) {
        this.ruhak = ruhak;
    }

    public Ruha[] getRuhak() {
        return ruhak;
    }

    public void bevesz(Ruha ruha) {
        ruhak[szamlal] = ruha;
        szamlal++;
    }

    public Ruha kiad(String tulaj) {
        for (int i = 0; i < ruhak.length; i++) {
            if (Objects.equals(ruhak[i].getTulaj(), tulaj)) {
                /* ide kerül a törlés kódja */
            }
        }
        return new Ruha("Szabó János");
    }

    public void mos() {
        for (Ruha ruha : ruhak) {
            ruha.setTiszta(true);
        }
        System.out.println("Minden ruha kitisztítva!");
    }
}
