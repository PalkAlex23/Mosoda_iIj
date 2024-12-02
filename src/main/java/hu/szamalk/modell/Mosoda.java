package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Mosoda {
    private final Ruha[] ruhak;
    private int db;

    public Mosoda() {
        this(5);
    }

    public Mosoda(int db) {
        this(new Ruha[db]);
    }

    public Mosoda(Ruha[] ruhak) {
        this.ruhak = ruhak;
        db = 0;
    }

    public List<Ruha> getRuhak() {
        ArrayList<Ruha> ujRuhak = new ArrayList<>();
        ujRuhak.addAll(Arrays.asList(ruhak));
        return ujRuhak;
    }

    public void bevesz(Ruha ruha) {
        if (db < ruhak.length) {
            ruhak[db++] = ruha;
        }
    }

    public Ruha kiad(String tulaj) {
        int i = 0;
        boolean talalva = false;
        while (i < ruhak.length && !talalva) {
            if (Objects.equals(ruhak[i].getTulaj(), tulaj)) {
                /* ide kerül a törlés kódja */
                ruhak[i] = null;
                talalva = true;
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

    public void kiir() {
        for(int i = 0; i < ruhak.length; i++) {
            System.out.println(ruhak[i]);
        }
    }
}
