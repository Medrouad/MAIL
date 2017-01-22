package TP1;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestLien.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestLien
{
    private TP1.Ordinateur ordinate1;
    private TP1.DisqueDur disqueDu1;


    /**
     * Default constructor for test class TestLien
     */
    public TestLien()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        ordinate1 = new TP1.Ordinateur("DELL", 400);
        disqueDu1 = new TP1.DisqueDur(750);
        ordinate1.affiche();
        ordinate1.setDisqueDur(disqueDu1);
        ordinate1.affiche();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void testExecution()
    {
        ordinate1.affiche();
    }
}


