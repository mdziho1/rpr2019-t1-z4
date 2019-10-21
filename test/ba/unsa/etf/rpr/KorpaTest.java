package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void previseArtikala() {
        assertDoesNotThrow(() -> {
            Korpa korpa = new Korpa();
            for (int i = 0; i < 2000; i++) {
                korpa.dodajArtikl(new Artikl("naziv", 2, "kod" + i));
            }
        });
    }

    @Test
    void dodajArtiklTest() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("naziv", 25, "kod"));
        Artikl[] artikli = korpa.getArtikli();
        assertNotNull(artikli[0]);
        assertEquals("naziv", artikli[0].getNaziv());
    }

    @Test
    void dajUkupnuCijenuArtikalaTest() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("naziv", 25, "kod"));
        assertEquals(25, korpa.dajUkupnuCijenuArtikala());
    }
}