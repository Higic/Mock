import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TilaustenKasitteluFakeTest {

    @Test
    public void testaaKasittelijaWithFakeHinnoittelija() {

        // Arrange
        float alkuSaldo = 100.0f;
        float listaHinta = 30.0f;
        float alennus = 20.0f;
        float loppuSaldo = alkuSaldo - (listaHinta * (1 - alennus / 100));

        Asiakas asiakas = new Asiakas(alkuSaldo);
        Tuote tuote = new Tuote("TDD in Action", listaHinta);
        IHinnoittelija hinnoittelija = new FakeHinnottelija(alennus);

        // Act
        TilaustenKäsittely kasittelija = new TilaustenKäsittely();
        kasittelija.setHinnoittelija(hinnoittelija);
        kasittelija.käsittele(new Tilaus(asiakas, tuote));

        // Assert
        assertEquals(loppuSaldo, asiakas.getSaldo(), 0.001);
    }

}
