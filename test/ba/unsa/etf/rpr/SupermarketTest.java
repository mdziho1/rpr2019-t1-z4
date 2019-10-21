package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SupermarketTest {



    @Test
    void dodajArtikalTest() {
        // Dodavanje artikla
        Supermarket supermarket = new Supermarket();

        assertEquals(0, supermarket.getArtikli().length);
        supermarket.dodajArtikl(new Artikl("Jabuka", 20, "1"));
        assertEquals(1, supermarket.getArtikli().length);

        // Testiranje ispravnosti artikla
        assertThrows(IllegalArgumentException.class, () -> supermarket.dodajArtikl(new Artikl("Jabuka", -100, "1")));
    }

    @Test
    void izbaciArtiklSaKodomTest() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Jabuka", 20, "1"));
        // Ne postoji artikal s kodom 2, izbacivanje vraca null
        assertNull(supermarket.izbaciArtiklSaKodom("2"));

        // Trebalo bi izbaciti artikal
        Artikl artikal = supermarket.izbaciArtiklSaKodom("1");
        assertEquals("1", artikal.getKod());
        assertEquals(0, supermarket.getArtikli().length);
    }

    @Test
    void getArtikliTest() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Jabuka", 20, "1"));

        assertEquals(1, supermarket.getArtikli().length);
        assertEquals("1", supermarket.getArtikli()[0].getKod());
    }
}