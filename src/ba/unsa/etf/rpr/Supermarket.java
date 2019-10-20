package ba.unsa.etf.rpr;


import java.util.ArrayList;
import java.util.Arrays;

public class Supermarket {
    private ArrayList<Artikl> artikli;

    Supermarket() {
        this.artikli = new ArrayList<>(1000);
    }

    void dodajArtikl(Artikl artikl) {
        artikli.add(artikl);
    }

    Artikl izbaciArtiklSaKodom(String kod) {
        int index = 0;
        for (Artikl a : artikli) {
            if (a.getKod().equals(kod)) {
                artikli.remove(index);
                return a;
            }
            index++;
        }
        return null;
    }

    Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[artikli.size()]);
    }
}
