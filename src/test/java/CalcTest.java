import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalcTest {
    Calcolatrice calcolatrice;

    @BeforeAll
    public final void setUp(){
        calcolatrice = new Calcolatrice();
    }

    @Test
    public void TestSomma(){
        assertTrue("somma esatta", calcolatrice.Somma(1,1)==2);
    }

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
    }

}
