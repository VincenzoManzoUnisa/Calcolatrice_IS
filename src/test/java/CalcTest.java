import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CalcTest {
    Calcolatrice calcolatrice;

    @Before
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

}
