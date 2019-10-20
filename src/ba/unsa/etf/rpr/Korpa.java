package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikli;

    Korpa() {
        this.artikli = new ArrayList<>(50);
    }

    boolean dodajArtikl(Artikl artikl) {
        return artikli.add(artikl);
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

    int dajUkupnuCijenuArtikala() {
        int ukupna = 0;
        for (Artikl a : artikli) {
            ukupna += a.getCijena();
        }
        return ukupna;
    }

    Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[artikli.size()]);
    }
}
