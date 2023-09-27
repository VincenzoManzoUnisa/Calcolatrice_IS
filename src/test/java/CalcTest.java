import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    private Calcolatrice calcolatrice; // Assicurati che Calcolatrice sia la classe che stai testando

    @BeforeEach
    public void setUp() {
        calcolatrice = new Calcolatrice(); // Inizializza l'oggetto calcolatrice prima di ogni test
    }

    @Test
    public void TestSomma() {
        int risultato = calcolatrice.Somma(2, 3);
        assertEquals(5, risultato); // Verifica che il risultato della somma sia corretto
    }


    /*
    public void TestMolt(){
        assertTrue("moltiplicazione esatta",calcolatrice.Moltiplicazione(2,2)==4);
    }

    @Test
    public void TestSottrazione(){
        assertTrue("sottrazione corretta", calcolatrice.sottrazione(7,4)==3);
    }

    @Test
    public  void TestDivione(){
        assertTrue("divisione corretta", calcolatrice.divisione(10,2)==5);
    }

    @Test
    public  void TestDivionePerZero(){
        assertTrue("divisione corretta", calcolatrice.divisione(10,0)==0);
    }*/

}
