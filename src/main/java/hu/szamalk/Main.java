package hu.szamalk;

import hu.szamalk.modell.Mosoda;
import hu.szamalk.modell.Ruha;

public class Main {
    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda();
        mosoda.bevesz(new Ruha("Orbán Károly"));
        mosoda.bevesz(new Ruha("Álmos Gergő"));
        mosoda.bevesz(new Ruha("Eperjes István"));
        mosoda.kiir();
    }
}