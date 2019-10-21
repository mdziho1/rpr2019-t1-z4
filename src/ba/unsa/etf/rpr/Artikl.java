package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl(String naziv, int cijena, String kod) {
        if (cijena < 0) {
            throw new IllegalArgumentException();
        }
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    String getNaziv() {
        return this.naziv;
    }

    int getCijena() {
        return this.cijena;
    }

    String getKod() {
        return this.kod;
    }
}
